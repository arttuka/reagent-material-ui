(ns reagent-material-ui.core.circular-progress
  "Imports @material-ui/core/CircularProgress as a Reagent component.
   Original documentation is at https://material-ui.com/api/circular-progress/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def circular-progress (r/adapt-react-class (.-CircularProgress js/MaterialUI)))
