const path = require('path')
const {merge} = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')
const components = require('./entries/components.json')
const coreComponents = require('./entries/coreComponents.json')

const toKebabCase = (s) => s.replace(/([a-z])_?([A-Z])/g, '$1-$2').toLowerCase()
const toPascalCase = (s) => s[0].toUpperCase() + s.slice(1).replace(/_/, '')

const makeExternal = (root, lib) => ({
  root,
  commonjs: lib,
  commonjs2: lib,
  umd: lib
})

const makeComponentExternal = (name, isCore = false) => makeExternal(
  (isCore ? 'MuiCore' : 'MuiMaterial') + toPascalCase(name),
  (isCore ? 'mui-core-' : 'mui-material-') + toKebabCase(name)
)

const getName = (re, request) => {
  if (re.test(request)) {
    const [_, name] = re.exec(request)
    return name
  }
}

const isCore = (context) => /@mui\/core\/[^/]*$/.test(context)

const makeEntry = (externals) => ({entry, root}) => ({
  entry: {
    [entry]: path.resolve(__dirname, 'entries/' + entry + '.js'),
  },
  output: {
    library: {
      name: {
        root
      }
    }
  },
  externals
})

const common = {
  output: {
    filename: '[name].inc.js',
    path: path.resolve(__dirname, 'src/mui'),
    library: {
      name: {
        amd: '[name]',
        commonjs: '[name]'
      },
      type: 'umd',
      umdNamedDefine: true
    },
    globalObject: `(typeof self !== 'undefined' ? self : global)`
  },
  externals: [{
    'react': makeExternal('React', 'react'),
    'react-dom': makeExternal('ReactDOM', 'react-dom')
  }]
}

const dev = {
  devtool: 'eval-source-map'
}

const production = {
  output: {
    filename: '[name].min.inc.js'
  },
  optimization: {
    minimize: true,
    minimizer: [
      new TerserWebpackPlugin({
        extractComments: false,
        terserOptions: {
          ecma: 2015,
          output: {
            comments: /^\**!|@preserve|@license|@cc_on/i
          }
        },
      })
    ]
  }
}

const externals = {
  components: function ({request}, callback) {
    const name = getName(/^@mui\/material\/(.*)$/, request)
    if (name === 'styles' || name === 'utils') {
      return callback(null, makeExternal(['MuiMaterial', name], ['mui-material', name]))
    } else if (name) {
      return callback(null, makeComponentExternal(name))
    }
    callback()
  },
  material: {
    '@mui/material': makeExternal('MuiMaterial', 'mui-material')
  },
  core: function ({context, request}, callback) {
    const name = getName(/^@mui\/core\/(.*)$/, request)
    if (isCore(context)) {
      return callback()
    } else if (request === '@mui/core') {
      return callback(null, makeExternal('MuiCore', 'mui-core'))
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  coreInternal: function ({context, request}, callback) {
    const name = getName(/^\.\.\/(.*)$/, request)
    if (!isCore(context)) {
      return callback()
    } else if (request === '../utils/isHostComponent') {
      return callback(null, makeExternal(['MuiCoreUtils', 'isHostComponent'], ['mui-core-utils', 'isHostComponent']))
    } else if (request === '../utils/extractEventHandlers') {
      return callback(null, makeExternal(['MuiCoreUtils', 'extractEventHandlers'], ['mui-core-utils', 'extractEventHandlers']))
    } else if (request === '../utils/appendOwnerState') {
      return callback()
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  coreIndex: function ({request}, callback) {
    const name = getName(/^\.\/(.*)$/, request)
    if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  utils: {
    '@mui/utils': makeExternal('MuiUtils', 'mui-utils')
  },
  lab: {
    '@mui/lab': makeExternal('MuiLab', 'mui-lab')
  }
}

const entries = [{
  entry: {
    'mui-material': path.resolve(__dirname, 'entries/mui-material.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiMaterial'
      }
    }
  },
  externals: [
    externals.core,
    externals.utils
  ]
}, {
  entry: {
    'mui-material-styles': path.resolve(__dirname, 'entries/mui-material-styles.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiMaterialStyles'
      }
    }
  },
  externals: [{
    '@mui/material/styles': makeExternal(['MuiMaterial', 'styles'], ['mui-material', 'styles'])
  }]
}, {
  entry: {
    'mui-material-utils': path.resolve(__dirname, 'entries/mui-material-utils.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiMaterialUtils'
      }
    }
  },
  externals: [{
    '@mui/material/utils': makeExternal(['MuiMaterial', 'utils'], ['mui-material', 'utils'])
  }]
}, {
  entry: {
    'mui-lab': path.resolve(__dirname, '../node_modules/@mui/lab/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiLab'
      }
    }
  },
  externals: [
    externals.components,
    externals.material,
    externals.core,
    externals.utils
  ]
}, {
  entry: {
    'mui-styles': path.resolve(__dirname, '../node_modules/@mui/styles/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiStyles'
      }
    }
  },
  externals: [
    externals.utils
  ]
}, {
  entry: {
    'mui-utils': path.resolve(__dirname, '../node_modules/@mui/utils/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiUtils'
      }
    }
  },
}, {
  entry: {
    'mui-core': path.resolve(__dirname, '../node_modules/@mui/core/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiCore'
      }
    }
  },
  externals: [
    externals.coreIndex
  ],
}].concat(components.map(makeEntry([
  externals.material,
  externals.lab,
  externals.core,
  externals.utils
]))).concat(coreComponents.map(makeEntry([
  externals.coreInternal,
  externals.utils
])))

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return entries.map(entry => merge(base, entry))
}
