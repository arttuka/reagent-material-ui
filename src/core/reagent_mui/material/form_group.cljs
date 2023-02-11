(ns reagent-mui.material.form-group
  "Imports @mui/material/FormGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/form-group/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FormGroup" :as MuiFormGroup]))

(def form-group (r/adapt-react-class (.-default MuiFormGroup)))
