(ns reagent-mui.material.use-radio-group
  "Imports @mui/material/RadioGroup/useRadioGroup as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-radio-group/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/RadioGroup" :as MuiRadioGroup]))

(def use-radio-group (wrap-js-function (.-useRadioGroup MuiRadioGroup)))
