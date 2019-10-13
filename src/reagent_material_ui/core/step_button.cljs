(ns reagent-material-ui.core.step-button
  "Imports @material-ui/core/StepButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-button/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step-button (r/adapt-react-class (.-StepButton js/MaterialUI)))
