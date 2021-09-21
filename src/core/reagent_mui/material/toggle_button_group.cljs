(ns reagent-mui.material.toggle-button-group
  "Imports @mui/material/ToggleButtonGroup as a Reagent component.
   Original documentation is at https://mui.com/api/toggle-button-group/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ToggleButtonGroup" :as MuiToggleButtonGroup]))

(def toggle-button-group (adapt-react-class (.-default MuiToggleButtonGroup) "mui-toggle-button-group"))
