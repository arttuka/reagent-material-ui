(ns reagent-mui.material.step-connector
  "Imports @mui/material/StepConnector as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-connector/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StepConnector" :as MuiStepConnector]))

(def step-connector (adapt-react-class (.-default MuiStepConnector) "mui-step-connector"))
