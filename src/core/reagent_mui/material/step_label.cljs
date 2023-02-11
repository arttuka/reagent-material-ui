(ns reagent-mui.material.step-label
  "Imports @mui/material/StepLabel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-label/ ."
  (:require [reagent.core :as r]
            ["@mui/material/StepLabel" :as MuiStepLabel]))

(def step-label (r/adapt-react-class (.-default MuiStepLabel)))
