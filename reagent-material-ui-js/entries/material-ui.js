(function () {
  if (window["MaterialUI"] === undefined) {
    window["MaterialUI"] = require('@material-ui/core');
    window["MaterialUI"].ScopedCssBaseline = require('@material-ui/core/ScopedCssBaseline');
    window["MaterialUIStyles"] = require('@material-ui/core/styles');
    window["MaterialUIColors"] = require('@material-ui/core/colors');
  }
})();
