(ns reagent-mui.material.input-label
  "Imports @mui/material/InputLabel as a Reagent component.
   Original documentation is at https://mui.com/api/input-label/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/InputLabel" :as MuiInputLabel]))

(def input-label (adapt-react-class (.-default MuiInputLabel) "mui-input-label"))
