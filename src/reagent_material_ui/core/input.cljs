(ns reagent-material-ui.core.input
  "Imports @material-ui/core/Input as a Reagent component.
   Original documentation is at https://material-ui.com/api/input/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def input (r/adapt-react-class (.-Input js/MaterialUI)))
