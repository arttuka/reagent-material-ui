(ns reagent-material-ui.core.radio-group
  "Imports @material-ui/core/RadioGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/radio-group/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def radio-group (r/adapt-react-class (.-RadioGroup js/MaterialUI)))
