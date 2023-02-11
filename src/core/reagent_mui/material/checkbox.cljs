(ns reagent-mui.material.checkbox
  "Imports @mui/material/Checkbox as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/checkbox/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Checkbox" :as MuiCheckbox]))

(def checkbox (r/adapt-react-class (.-default MuiCheckbox)))
