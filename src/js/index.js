(function () {
  if (window["MaterialUI"] === undefined) {
    window["MaterialUI"] = require('@material-ui/core');
    window["MaterialUIStyles"] = require('@material-ui/core/styles');
    window["MaterialUIColors"] = require('@material-ui/core/colors');
    window["MaterialUIPickers"] = require('@material-ui/pickers');
    window["MaterialUILab"] = require('@material-ui/lab');
  }
})();
