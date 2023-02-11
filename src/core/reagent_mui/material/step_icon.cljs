(ns reagent-mui.material.step-icon
  "Imports @mui/material/StepIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-icon/ ."
  (:require [reagent.core :as r]
            ["@mui/material/StepIcon" :as MuiStepIcon]))

(def step-icon (r/adapt-react-class (.-default MuiStepIcon)))
