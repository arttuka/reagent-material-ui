(ns reagent-material-ui.core.step-icon
  "Imports @material-ui/core/StepIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-icon/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step-icon (r/adapt-react-class (.-StepIcon js/MaterialUI)))
