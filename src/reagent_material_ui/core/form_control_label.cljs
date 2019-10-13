(ns reagent-material-ui.core.form-control-label
  "Imports @material-ui/core/FormControlLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-control-label/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def form-control-label (r/adapt-react-class (.-FormControlLabel js/MaterialUI)))
