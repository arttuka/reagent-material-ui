(function () {
  if (window["MaterialUI"] === undefined) {
    window["MaterialUI"] = require('@material-ui/core');
    window["MaterialUI"].utils = require('@material-ui/core/utils');
    window["MaterialUIStyles"] = require('@material-ui/core/styles');
    window["MaterialUIColors"] = require('@material-ui/core/colors');
  }
})();
