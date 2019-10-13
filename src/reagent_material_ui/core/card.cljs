(ns reagent-material-ui.core.card
  "Imports @material-ui/core/Card as a Reagent component.
   Original documentation is at https://material-ui.com/api/card/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card (r/adapt-react-class (.-Card js/MaterialUI)))
