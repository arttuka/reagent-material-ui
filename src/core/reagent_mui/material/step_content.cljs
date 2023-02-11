(ns reagent-mui.material.step-content
  "Imports @mui/material/StepContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-content/ ."
  (:require [reagent.core :as r]
            ["@mui/material/StepContent" :as MuiStepContent]))

(def step-content (r/adapt-react-class (.-default MuiStepContent)))
