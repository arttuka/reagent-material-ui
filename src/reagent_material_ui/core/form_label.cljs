(ns reagent-material-ui.core.form-label
  "Imports @material-ui/core/FormLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-label/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def form-label (r/adapt-react-class (.-FormLabel js/MaterialUI)))
