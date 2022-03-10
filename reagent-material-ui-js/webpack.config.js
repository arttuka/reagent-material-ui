const path = require('path')
const {merge} = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')
const components = require('./entries/components.json')
const baseComponents = require('./entries/baseComponents.json')

const toKebabCase = (s) => s.replace(/([a-z])_?([A-Z])/g, '$1-$2').toLowerCase()
const toPascalCase = (s) => s[0].toUpperCase() + s.slice(1).replace(/_/, '')

const makeExternal = (root, lib) => ({
  root,
  commonjs: lib,
  commonjs2: lib,
  umd: lib
})

const makeComponentExternal = (name, isBase = false, property = null) => {
  const pascalName = (isBase ? 'MuiBase' : 'MuiMaterial') + toPascalCase(name)
  const kebabName = (isBase ? 'mui-base-' : 'mui-material-') + toKebabCase(name)
  return (
    property !== null
      ? makeExternal([pascalName, property], [kebabName, property])
      : makeExternal(pascalName, kebabName)
  )
}

const getName = (re, request) => {
  if (re.test(request)) {
    const [_, name] = re.exec(request)
    return name
  }
}

const isBase = (context) => /@mui\/base\/[^/]*$/.test(context)

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

const baseInternals = {
  '../className/ClassNameGenerator': makeComponentExternal('className', true, 'unstable_ClassNameGenerator'),
  '../utils/isHostComponent': makeComponentExternal('Utils', true, 'isHostComponent'),
  '../utils/extractEventHandlers': makeComponentExternal('Utils', true, 'extractEventHandlers'),
  '../utils/areArraysEqual': makeComponentExternal('Utils', true, 'areArraysEqual'),
  '../FormControlUnstyled/useFormControl': makeComponentExternal('FormControlUnstyled', true, 'useFormControlUnstyled'),
  '../FormControlUnstyled/FormControlContext': makeComponentExternal('FormControlUnstyled', true, 'FormControlUnstyledContext'),
  '../SelectUnstyled/useSelect': makeComponentExternal('SelectUnstyled', true, 'useSelect'),
  '../SelectUnstyled/SelectUnstyledContext': makeComponentExternal('SelectUnstyled', true, 'SelectUnstyledContext'),
  '../SelectUnstyled/selectUnstyledClasses': makeComponentExternal('SelectUnstyled', true, 'selectUnstyledClasses')
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
  base: function ({context, request}, callback) {
    const name = getName(/^@mui\/base\/(.*)$/, request)
    if (isBase(context)) {
      return callback()
    } else if (request === '@mui/base') {
      return callback(null, makeExternal('MuiBase', 'mui-base'))
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  baseInternal: function ({context, request}, callback) {
    const name = getName(/^\.\.\/(.*)$/, request)
    if (!isBase(context)) {
      return callback()
    } else if (request in baseInternals) {
      return callback(null, baseInternals[request])
    } else if (request === '../utils/appendOwnerState') {
      return callback()
    } else if (request === '../SelectUnstyled/utils') {
      return callback()
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  baseIndex: function ({request}, callback) {
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
    externals.base,
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
    externals.base,
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
    'mui-base': path.resolve(__dirname, '../node_modules/@mui/base/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MuiBase'
      }
    }
  },
  externals: [
    externals.baseIndex
  ],
}].concat(components.map(makeEntry([
  externals.material,
  externals.lab,
  externals.base,
  externals.utils
]))).concat(baseComponents.map(makeEntry([
  externals.baseInternal,
  externals.utils
])))

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return entries.map(entry => merge(base, entry))
}
