(ns reagent-material-ui.core.toggle-button
  "Imports @material-ui/core/ToggleButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/toggle-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ToggleButton" :as MuiToggleButton]))

(def toggle-button (adapt-react-class (or (.-default MuiToggleButton) (.-ToggleButton MuiToggleButton)) "mui-toggle-button"))
