(ns reagent-material-ui.core.card-action-area
  "Imports @material-ui/core/CardActionArea as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-action-area/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card-action-area (r/adapt-react-class (.-CardActionArea js/MaterialUI)))
