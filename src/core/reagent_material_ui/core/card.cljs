(ns reagent-material-ui.core.card
  "Imports @material-ui/core/Card as a Reagent component.
   Original documentation is at https://material-ui.com/api/card/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Card" :as Card]))

(def card (adapt-react-class (or (.-default Card) (.-Card Card)) "mui-card"))
