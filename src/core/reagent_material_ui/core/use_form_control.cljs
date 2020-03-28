(ns reagent-material-ui.core.use-form-control
  "Imports @material-ui/core/FormControl/useFormControl as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-form-control/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/FormControl" :as FormControl]))

(def use-form-control (wrap-js-function (.-useFormControl FormControl)))
