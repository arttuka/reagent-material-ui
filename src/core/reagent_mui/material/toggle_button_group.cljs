(ns reagent-mui.material.toggle-button-group
  "Imports @mui/material/ToggleButtonGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/toggle-button-group/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ToggleButtonGroup" :as MuiToggleButtonGroup]))

(def toggle-button-group (r/adapt-react-class (.-default MuiToggleButtonGroup)))
