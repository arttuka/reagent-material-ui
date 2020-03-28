(ns reagent-material-ui.core.card-header
  "Imports @material-ui/core/CardHeader as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-header/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/CardHeader" :as CardHeader]))

(def card-header (adapt-react-class (or (.-default CardHeader) (.-CardHeader CardHeader)) "mui-card-header"))
