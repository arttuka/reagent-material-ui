(ns reagent-material-ui.core.use-radio-group
  "Imports @material-ui/core/RadioGroup/useRadioGroup as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-radio-group/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/RadioGroup" :as MuiRadioGroup]))

(def use-radio-group (wrap-js-function (.-useRadioGroup MuiRadioGroup)))
