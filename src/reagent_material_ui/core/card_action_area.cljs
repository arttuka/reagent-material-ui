(ns reagent-material-ui.core.card-action-area
  "Imports @material-ui/core/CardActionArea as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-action-area/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def card-action-area (adapt-react-class (.-CardActionArea js/MaterialUI) "mui-card-action-area"))
