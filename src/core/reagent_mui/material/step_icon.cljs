(ns reagent-mui.material.step-icon
  "Imports @mui/material/StepIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step-icon/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/StepIcon" :as MuiStepIcon]))

(def step-icon (adapt-react-class (.-default MuiStepIcon) "mui-step-icon"))
