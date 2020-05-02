(ns reagent-material-ui.core.step-connector
  "Imports @material-ui/core/StepConnector as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-connector/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepConnector" :as MuiStepConnector]))

(def step-connector (adapt-react-class (or (.-default MuiStepConnector) (.-StepConnector MuiStepConnector)) "mui-step-connector"))
