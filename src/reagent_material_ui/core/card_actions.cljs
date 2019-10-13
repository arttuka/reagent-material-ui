(ns reagent-material-ui.core.card-actions
  "Imports @material-ui/core/CardActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-actions/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card-actions (r/adapt-react-class (.-CardActions js/MaterialUI)))
