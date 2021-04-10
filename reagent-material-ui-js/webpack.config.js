const path = require('path')
const {merge} = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')
const components = require('./entries/components.json')

const makeExternal = (root, lib) => ({
  root,
  commonjs: lib,
  commonjs2: lib,
  umd: lib
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
  core: function ({context, request}, callback) {
    const re = /^@material-ui\/core\/(.*)$/
    if (re.test(request)) {
      const [_, name] = re.exec(request)
      return callback(null, makeExternal(['MaterialUI', name], ['material-ui', name]))
    } else if (request === '@material-ui/core') {
      return callback(null, makeExternal('MaterialUI', 'material-ui'))
    }
    callback()
  },
  styles: {
    '@material-ui/styles': makeExternal('MaterialUIStyles', 'material-ui-styles')
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
    externals.styles,
    externals.utils
  ]
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
    externals.core,
    externals.utils
  ]
}, {
  entry: {
    'material-ui-pickers': path.resolve(__dirname, '../node_modules/@material-ui/pickers/index.js')
  },
  output: {
    library: {
      root: 'MaterialUIPickers'
    }
  },
  externals: [
    externals.core,
    externals.styles
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
}].concat(components.map(({ entry, root }) => ({
  entry: {
    [entry]: path.resolve(__dirname, 'entries/' + entry + '.js'),
  },
  output: {
    library: {
      root
    }
  },
  externals: [
    externals.core,
    externals.lab
  ]
})))

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return entries.map(entry => merge(base, entry))
}