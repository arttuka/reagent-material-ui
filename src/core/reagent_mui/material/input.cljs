(ns reagent-mui.material.input
  "Imports @mui/material/Input as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Input" :as MuiInput]))

(def input (r/adapt-react-class (.-default MuiInput)))
