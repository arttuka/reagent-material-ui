(ns reagent-material-ui.core.step-label
  "Imports @material-ui/core/StepLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-label/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step-label (r/adapt-react-class (.-StepLabel js/MaterialUI)))
