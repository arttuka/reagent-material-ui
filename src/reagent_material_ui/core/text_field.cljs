(ns reagent-material-ui.core.text-field
  "Imports @material-ui/core/TextField as a Reagent component.
   Original documentation is at https://material-ui.com/api/text-field/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def text-field (r/adapt-react-class (.-TextField js/MaterialUI)))
