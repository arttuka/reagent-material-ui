(ns reagent-material-ui.core.use-radio-group
  "Imports @material-ui/core/RadioGroup/useRadioGroup as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-radio-group/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/RadioGroup" :as RadioGroup]))

(def use-radio-group (wrap-js-function (.-useRadioGroup RadioGroup)))
