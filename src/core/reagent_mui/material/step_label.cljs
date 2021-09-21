(ns reagent-mui.material.step-label
  "Imports @mui/material/StepLabel as a Reagent component.
   Original documentation is at https://mui.com/api/step-label/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StepLabel" :as MuiStepLabel]))

(def step-label (adapt-react-class (.-default MuiStepLabel) "mui-step-label"))
