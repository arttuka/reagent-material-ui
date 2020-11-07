const path = require('path')
const {merge} = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')

const makeExternal = (root, lib) => ({
  root,
  commonjs: lib,
  commonjs2: lib,
  umd: lib
})

const common = {
  output: {
    filename: '[name].inc.js',
    path: path.resolve(__dirname, 'src/generated/material-ui'),
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
  }],
  devtool: false
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
  core: [
    function ({context, request}, callback) {
      const re = /^@material-ui\/core\/(.*)$/
      if (re.test(request)) {
        const [_, name] = re.exec(request)
        return callback(null, makeExternal(['MaterialUI', name], ['material-ui', name]))
      }
      callback()
    },
    {
      '@material-ui/core': makeExternal('MaterialUI', 'material-ui')
    }
  ],
  styles: {
    '@material-ui/styles': makeExternal('MaterialUIStyles','material-ui-styles')
  },
  utils: {
    '@material-ui/utils': makeExternal('MaterialUIUtils', 'material-ui-utils')
  }
}

const entries = [{
  entry: {
    'material-ui': './src/js/material-ui.js'
  },
  output: {
    library: {
      root: 'MaterialUI'
    }
  },
  externals: [
    externals.styles,
    externals.utils
  ]
}, {
  entry: {
    'material-ui-lab': './node_modules/@material-ui/lab/index.js'
  },
  output: {
    library: {
      root: 'MaterialUILab'
    }
  },
  externals: [
    ...externals.core,
    externals.utils
  ]
}, {
  entry: {
    'material-ui-pickers': './node_modules/@material-ui/pickers/index.js'
  },
  output: {
    library: {
      root: 'MaterialUIPickers'
    }
  },
  externals: [
    ...externals.core,
    externals.styles
  ]
}, {
  entry: {
    'material-ui-styles': './node_modules/@material-ui/styles/index.js'
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
    'material-ui-utils': './node_modules/@material-ui/utils/index.js'
  },
  output: {
    library: {
      root: 'MaterialUIUtils'
    }
  },
}]

module.exports = function (env, argv) {
  const base = argv.mode === 'production' ? merge(common, production) : common
  return entries.map(entry => merge(base, entry))
}
