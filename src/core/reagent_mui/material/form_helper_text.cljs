(ns reagent-mui.material.form-helper-text
  "Imports @mui/material/FormHelperText as a Reagent component.
   Original documentation is at https://mui.com/api/form-helper-text/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FormHelperText" :as MuiFormHelperText]))

(def form-helper-text (adapt-react-class (.-default MuiFormHelperText) "mui-form-helper-text"))
