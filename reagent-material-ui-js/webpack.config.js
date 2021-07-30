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

const makeUnstyledExternal = (name) => makeExternal(
  'MaterialUIUnstyled' + toPascalCase(name),
  'material-ui-unstyled-' + toKebabCase(name)
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
      root
    }
  },
  externals
})

const common = {
  output: {
    filename: '[name].inc.js',
    path: path.resolve(__dirname, 'src/material-ui'),
    libraryTarget: 'umd',
    library: {
      amd: '[name]',
      commonjs: '[name]'
    },
    umdNamedDefine: true
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
    if (name) {
      return callback(null, makeExternal(['MaterialUI', name], ['material-ui', name]))
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
    }
    if (request === '@material-ui/unstyled') {
      return callback(null, makeExternal('MaterialUIUnstyled', 'material-ui-unstyled'))
    } else if (name) {
      return callback(null, makeUnstyledExternal(name))
    }
    callback()
  },
  unstyledInternal: function ({context, request}, callback) {
    const name = getName(/^\.\.\/(.*)$/, request)
    if (!isUnstyled(context)) {
      return callback()
    } else if (request === '../utils/isHostComponent') {
      return callback(null, makeExternal(['MaterialUIUnstyledUtils', 'isHostComponent'], ['material-ui-unstyled-utils', 'isHostComponent']))
    } else if (name) {
      return callback(null, makeUnstyledExternal(name))
    }
    callback()
  },
  unstyledIndex: function ({request}, callback) {
    const name = getName(/^\.\/(.*)$/, request)
    if (name) {
      return callback(null, makeUnstyledExternal(name))
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
      root: 'MaterialUI'
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
      root: 'MaterialUICoreStyles'
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
      root: 'MaterialUICoreUtils'
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
      root: 'MaterialUILab'
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
      root: 'MaterialUIStyles'
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
      root: 'MaterialUIUtils'
    }
  },
}, {
  entry: {
    'material-ui-unstyled': path.resolve(__dirname, '../node_modules/@material-ui/unstyled/index.js')
  },
  output: {
    library: {
      root: 'MaterialUIUnstyled'
    }
  },
  externals: [
    externals.unstyledIndex
  ],
}].concat(components.map(makeEntry([
  externals.core,
  externals.lab,
  externals.unstyled
]))).concat(unstyledComponents.map(makeEntry([
  externals.unstyledInternal,
  externals.utils
])))

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return entries.map(entry => merge(base, entry))
}
