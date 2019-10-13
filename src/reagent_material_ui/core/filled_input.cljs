(ns reagent-material-ui.core.filled-input
  "Imports @material-ui/core/FilledInput as a Reagent component.
   Original documentation is at https://material-ui.com/api/filled-input/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def filled-input (r/adapt-react-class (.-FilledInput js/MaterialUI)))
