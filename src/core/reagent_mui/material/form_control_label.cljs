(ns reagent-mui.material.form-control-label
  "Imports @mui/material/FormControlLabel as a Reagent component.
   Original documentation is at https://mui.com/api/form-control-label/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FormControlLabel" :as MuiFormControlLabel]))

(def form-control-label (adapt-react-class (.-default MuiFormControlLabel) "mui-form-control-label"))
