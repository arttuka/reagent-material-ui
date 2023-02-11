(ns reagent-mui.material.form-label
  "Imports @mui/material/FormLabel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/form-label/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FormLabel" :as MuiFormLabel]))

(def form-label (r/adapt-react-class (.-default MuiFormLabel)))
