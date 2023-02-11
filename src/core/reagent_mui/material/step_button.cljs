(ns reagent-mui.material.step-button
  "Imports @mui/material/StepButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/StepButton" :as MuiStepButton]))

(def step-button (r/adapt-react-class (.-default MuiStepButton)))
