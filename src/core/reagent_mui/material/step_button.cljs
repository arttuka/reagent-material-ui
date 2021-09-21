(ns reagent-mui.material.step-button
  "Imports @mui/material/StepButton as a Reagent component.
   Original documentation is at https://mui.com/api/step-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StepButton" :as MuiStepButton]))

(def step-button (adapt-react-class (.-default MuiStepButton) "mui-step-button"))
