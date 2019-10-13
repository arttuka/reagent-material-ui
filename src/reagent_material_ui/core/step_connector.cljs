(ns reagent-material-ui.core.step-connector
  "Imports @material-ui/core/StepConnector as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-connector/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step-connector (r/adapt-react-class (.-StepConnector js/MaterialUI)))
