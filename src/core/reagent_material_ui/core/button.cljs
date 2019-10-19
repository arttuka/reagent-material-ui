(ns reagent-material-ui.core.button
  "Imports @material-ui/core/Button as a Reagent component.
   Original documentation is at https://material-ui.com/api/button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def button (adapt-react-class (.-Button js/MaterialUI) "mui-button"))
