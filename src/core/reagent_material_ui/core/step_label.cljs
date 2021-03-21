(ns reagent-material-ui.core.step-label
  "Imports @material-ui/core/StepLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepLabel" :as MuiStepLabel]))

(def step-label (adapt-react-class (.-default MuiStepLabel) "mui-step-label"))
