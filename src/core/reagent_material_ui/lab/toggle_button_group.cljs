(ns reagent-material-ui.lab.toggle-button-group
  "Imports @material-ui/lab/ToggleButtonGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/toggle-button-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/ToggleButtonGroup" :as MuiToggleButtonGroup]))

(def toggle-button-group (adapt-react-class (.-default MuiToggleButtonGroup) "mui-toggle-button-group"))
