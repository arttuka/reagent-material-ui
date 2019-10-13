(ns reagent-material-ui.core.card-media
  "Imports @material-ui/core/CardMedia as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-media/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card-media (r/adapt-react-class (.-CardMedia js/MaterialUI)))
