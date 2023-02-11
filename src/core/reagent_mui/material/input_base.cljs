(ns reagent-mui.material.input-base
  "Imports @mui/material/InputBase as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input-base/ ."
  (:require [reagent.core :as r]
            ["@mui/material/InputBase" :as MuiInputBase]))

(def input-base (r/adapt-react-class (.-default MuiInputBase)))
