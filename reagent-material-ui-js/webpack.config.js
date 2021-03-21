const path = require('path')
const { merge } = require('webpack-merge')
const TerserWebpackPlugin = require('terser-webpack-plugin')

const common = {
  output: {
    filename: '[name].inc.js',
    path: path.resolve(__dirname, 'src/material-ui')
  },
  externals: [{
    'react': 'React',
    'react-dom': 'ReactDOM'
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

const externals = [
  function(context, request, callback) {
    const re = /^@material-ui\/core\/(.*)$/
    if (re.test(request)) {
      const [_, name] = re.exec(request)
      if (name === 'utils') {
        return callback()
      }
      const external = name === 'styles' ? 'MaterialUIStyles' : `MaterialUI.${name}`
      return callback(null, `root ${external}`)
    }
    callback()
  },
  {
    '@material-ui/core': 'MaterialUI',
    '@material-ui/styles': 'MaterialUIStyles'
  }
]

const materialUI = {
  entry: {
    'material-ui': path.resolve(__dirname, 'entries/material-ui.js')
  }
}

const materialUIPickers = {
  entry: {
    'material-ui-pickers': path.resolve(__dirname, 'entries/material-ui-pickers.js')
  },
  externals
}

const materialUILab = {
  entry: {
    'material-ui-lab': path.resolve(__dirname, 'entries/material-ui-lab.js')
  },
  externals
}

module.exports = function (env, argv) {
  const base = merge(common, argv.mode === 'production' ? production : dev)
  return [
    merge(base, materialUI),
    merge(base, materialUIPickers),
    merge(base, materialUILab)
  ]
}
