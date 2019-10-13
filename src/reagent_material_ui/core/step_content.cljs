(ns reagent-material-ui.core.step-content
  "Imports @material-ui/core/StepContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-content/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step-content (r/adapt-react-class (.-StepContent js/MaterialUI)))
