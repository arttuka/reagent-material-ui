(ns reagent-mui.material.step-connector
  "Imports @mui/material/StepConnector as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-connector/ ."
  (:require [reagent.core :as r]
            ["@mui/material/StepConnector" :as MuiStepConnector]))

(def step-connector (r/adapt-react-class (.-default MuiStepConnector)))
