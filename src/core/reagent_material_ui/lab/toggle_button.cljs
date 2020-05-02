(ns reagent-material-ui.lab.toggle-button
  "Imports @material-ui/lab/ToggleButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/toggle-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/ToggleButton" :as MuiToggleButton]))

(def toggle-button (adapt-react-class (or (.-default MuiToggleButton) (.-ToggleButton MuiToggleButton)) "mui-toggle-button"))
