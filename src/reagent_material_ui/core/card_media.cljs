(ns reagent-material-ui.core.card-media
  "Imports @material-ui/core/CardMedia as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-media/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def card-media (adapt-react-class (.-CardMedia js/MaterialUI) "mui-card-media"))
