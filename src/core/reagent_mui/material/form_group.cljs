(ns reagent-mui.material.form-group
  "Imports @mui/material/FormGroup as a Reagent component.
   Original documentation is at https://mui.com/api/form-group/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FormGroup" :as MuiFormGroup]))

(def form-group (adapt-react-class (.-default MuiFormGroup) "mui-form-group"))
