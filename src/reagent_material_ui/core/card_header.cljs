(ns reagent-material-ui.core.card-header
  "Imports @material-ui/core/CardHeader as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-header/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def card-header (adapt-react-class (.-CardHeader js/MaterialUI) "mui-card-header"))
