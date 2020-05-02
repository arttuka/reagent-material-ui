(ns reagent-material-ui.core.step-icon
  "Imports @material-ui/core/StepIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepIcon" :as MuiStepIcon]))

(def step-icon (adapt-react-class (or (.-default MuiStepIcon) (.-StepIcon MuiStepIcon)) "mui-step-icon"))
