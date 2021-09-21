(ns reagent-mui.material.form-label
  "Imports @mui/material/FormLabel as a Reagent component.
   Original documentation is at https://mui.com/api/form-label/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FormLabel" :as MuiFormLabel]))

(def form-label (adapt-react-class (.-default MuiFormLabel) "mui-form-label"))
