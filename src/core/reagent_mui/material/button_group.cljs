(ns reagent-mui.material.button-group
  "Imports @mui/material/ButtonGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/button-group/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ButtonGroup" :as MuiButtonGroup]))

(def button-group (r/adapt-react-class (.-default MuiButtonGroup)))
