(ns reagent-material-ui.core.grid
  "Imports @material-ui/core/Grid as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def grid (r/adapt-react-class (.-Grid js/MaterialUI)))
