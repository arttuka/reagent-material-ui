(ns reagent-mui.material.form-control-label
  "Imports @mui/material/FormControlLabel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/form-control-label/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FormControlLabel" :as MuiFormControlLabel]))

(def form-control-label (r/adapt-react-class (.-default MuiFormControlLabel)))
