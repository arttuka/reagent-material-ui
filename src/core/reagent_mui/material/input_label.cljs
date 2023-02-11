(ns reagent-mui.material.input-label
  "Imports @mui/material/InputLabel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input-label/ ."
  (:require [reagent.core :as r]
            ["@mui/material/InputLabel" :as MuiInputLabel]))

(def input-label (r/adapt-react-class (.-default MuiInputLabel)))
