(ns reagent-mui.material.radio-group
  "Imports @mui/material/RadioGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/radio-group/ ."
  (:require [reagent.core :as r]
            ["@mui/material/RadioGroup" :as MuiRadioGroup]))

(def radio-group (r/adapt-react-class (.-default MuiRadioGroup)))
