(ns reagent-material-ui.core.card-actions
  "Imports @material-ui/core/CardActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def card-actions (adapt-react-class (.-CardActions js/MaterialUI) "mui-card-actions"))
