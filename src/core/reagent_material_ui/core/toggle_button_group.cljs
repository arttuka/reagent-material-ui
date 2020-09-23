(ns reagent-material-ui.core.toggle-button-group
  "Imports @material-ui/core/ToggleButtonGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/toggle-button-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ToggleButtonGroup" :as MuiToggleButtonGroup]))

(def toggle-button-group (adapt-react-class (or (.-default MuiToggleButtonGroup) (.-ToggleButtonGroup MuiToggleButtonGroup)) "mui-toggle-button-group"))
