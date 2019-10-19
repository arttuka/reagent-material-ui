(ns reagent-material-ui.core.grid
  "Imports @material-ui/core/Grid as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def grid (adapt-react-class (.-Grid js/MaterialUI) "mui-grid"))
