(ns reagent-material-ui.core.card-action-area
  "Imports @material-ui/core/CardActionArea as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-action-area/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/CardActionArea" :as CardActionArea]))

(def card-action-area (adapt-react-class (or (.-default CardActionArea) (.-CardActionArea CardActionArea)) "mui-card-action-area"))
