(ns reagent-material-ui.core.card-content
  "Imports @material-ui/core/CardContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-content/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card-content (r/adapt-react-class (.-CardContent js/MaterialUI)))
