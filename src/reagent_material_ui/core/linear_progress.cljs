(ns reagent-material-ui.core.linear-progress
  "Imports @material-ui/core/LinearProgress as a Reagent component.
   Original documentation is at https://material-ui.com/api/linear-progress/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def linear-progress (r/adapt-react-class (.-LinearProgress js/MaterialUI)))
