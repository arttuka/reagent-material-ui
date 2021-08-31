const path = require('path')
const {merge} = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')
const components = require('./entries/components.json')
const unstyledComponents = require('./entries/unstyledComponents.json')

const toKebabCase = (s) => s.replace(/([a-z])_?([A-Z])/g, '$1-$2').toLowerCase()
const toPascalCase = (s) => s[0].toUpperCase() + s.slice(1).replace(/_/, '')

const makeExternal = (root, lib) => ({
  root,
  commonjs: lib,
  commonjs2: lib,
  umd: lib
})

const makeComponentExternal = (name, isUnstyled = false) => makeExternal(
  'MaterialUI' + (isUnstyled ? 'Unstyled' : '') + toPascalCase(name),
  'material-ui-' + (isUnstyled ? 'unstyled-' : '') + toKebabCase(name)
)

const getName = (re, request) => {
  if (re.test(request)) {
    const [_, name] = re.exec(request)
    return name
  }
}

const isUnstyled = (context) => /@material-ui\/unstyled\/[^/]*$/.test(context)

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
    path: path.resolve(__dirname, 'src/material-ui'),
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
    const name = getName(/^@material-ui\/core\/(.*)$/, request)
    if (name === 'styles' || name === 'utils') {
      return callback(null, makeExternal(['MaterialUI', name], ['material-ui', name]))
    } else if (name) {
      return callback(null, makeComponentExternal(name))
    }
    callback()
  },
  core: {
    '@material-ui/core': makeExternal('MaterialUI', 'material-ui')
  },
  unstyled: function ({context, request}, callback) {
    const name = getName(/^@material-ui\/unstyled\/(.*)$/, request)
    if (isUnstyled(context)) {
      return callback()
    } else if (request === '@material-ui/unstyled') {
      return callback(null, makeExternal('MaterialUIUnstyled', 'material-ui-unstyled'))
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  unstyledInternal: function ({context, request}, callback) {
    const name = getName(/^\.\.\/(.*)$/, request)
    if (!isUnstyled(context)) {
      return callback()
    } else if (request === '../utils/isHostComponent') {
      return callback(null, makeExternal(['MaterialUIUnstyledUtils', 'isHostComponent'], ['material-ui-unstyled-utils', 'isHostComponent']))
    } else if (request === '../utils/appendOwnerState') {
      return callback()
    } else if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  unstyledIndex: function ({request}, callback) {
    const name = getName(/^\.\/(.*)$/, request)
    if (name) {
      return callback(null, makeComponentExternal(name, true))
    }
    callback()
  },
  utils: {
    '@material-ui/utils': makeExternal('MaterialUIUtils', 'material-ui-utils')
  },
  lab: {
    '@material-ui/lab': makeExternal('MaterialUILab', 'material-ui-lab')
  }
}

const entries = [{
  entry: {
    'material-ui': path.resolve(__dirname, 'entries/material-ui.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUI'
      }
    }
  },
  externals: [
    externals.unstyled,
    externals.utils
  ]
}, {
  entry: {
    'material-ui-core-styles': path.resolve(__dirname, 'entries/material-ui-core-styles.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUICoreStyles'
      }
    }
  },
  externals: [{
    '@material-ui/core/styles': makeExternal(['MaterialUI', 'styles'], ['material-ui', 'styles'])
  }]
}, {
  entry: {
    'material-ui-core-utils': path.resolve(__dirname, 'entries/material-ui-core-utils.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUICoreUtils'
      }
    }
  },
  externals: [{
    '@material-ui/core/utils': makeExternal(['MaterialUI', 'utils'], ['material-ui', 'utils'])
  }]
}, {
  entry: {
    'material-ui-lab': path.resolve(__dirname, '../node_modules/@material-ui/lab/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUILab'
      }
    }
  },
  externals: [
    externals.components,
    externals.core,
    externals.unstyled,
    externals.utils
  ]
}, {
  entry: {
    'material-ui-styles': path.resolve(__dirname, '../node_modules/@material-ui/styles/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUIStyles'
      }
    }
  },
  externals: [
    externals.utils
  ]
}, {
  entry: {
    'material-ui-utils': path.resolve(__dirname, '../node_modules/@material-ui/utils/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUIUtils'
      }
    }
  },
}, {
  entry: {
    'material-ui-unstyled': path.resolve(__dirname, '../node_modules/@material-ui/unstyled/index.js')
  },
  output: {
    library: {
      name: {
        root: 'MaterialUIUnstyled'
      }
    }
  },
  externals: [
    externals.unstyledIndex
  ],
}].concat(components.map(makeEntry([
  externals.core,
  externals.lab,
  externals.unstyled,
  externals.utils
]))).concat(unstyledComponents.map(makeEntry([
  externals.unstyledInternal,
  externals.utils
])))

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return entries.map(entry => merge(base, entry))
}
