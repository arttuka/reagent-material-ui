var path = require('path');
var config = {
  entry: {
    'material-ui': './src/js/index.js',
  },
  output: {
    filename: '[name].inc.js',
    path: path.resolve(__dirname, 'src/generated/material-ui')
  },
  externals: {
    'react': 'React',
    'react-dom': 'ReactDOM'
  }
};

module.exports = function (env, argv) {
  if (argv.mode === 'production') {
    config.output.filename = '[name].min.inc.js';
  }
  return config;
};
