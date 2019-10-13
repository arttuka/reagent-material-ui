(ns reagent-material-ui.core.grid-list
  "Imports @material-ui/core/GridList as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def grid-list (r/adapt-react-class (.-GridList js/MaterialUI)))
