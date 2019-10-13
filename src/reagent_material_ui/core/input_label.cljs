(ns reagent-material-ui.core.input-label
  "Imports @material-ui/core/InputLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-label/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def input-label (r/adapt-react-class (.-InputLabel js/MaterialUI)))
