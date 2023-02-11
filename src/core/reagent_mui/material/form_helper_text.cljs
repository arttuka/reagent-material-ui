(ns reagent-mui.material.form-helper-text
  "Imports @mui/material/FormHelperText as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/form-helper-text/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FormHelperText" :as MuiFormHelperText]))

(def form-helper-text (r/adapt-react-class (.-default MuiFormHelperText)))
