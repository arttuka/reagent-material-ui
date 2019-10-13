(ns reagent-material-ui.core.card-header
  "Imports @material-ui/core/CardHeader as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-header/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def card-header (r/adapt-react-class (.-CardHeader js/MaterialUI)))
