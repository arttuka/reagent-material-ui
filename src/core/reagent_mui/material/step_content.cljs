(ns reagent-mui.material.step-content
  "Imports @mui/material/StepContent as a Reagent component.
   Original documentation is at https://mui.com/api/step-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StepContent" :as MuiStepContent]))

(def step-content (adapt-react-class (.-default MuiStepContent) "mui-step-content"))
