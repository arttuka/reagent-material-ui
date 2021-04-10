(ns reagent-material-ui.core.step-content
  "Imports @material-ui/core/StepContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepContent" :as MuiStepContent]))

(def step-content (adapt-react-class (.-default MuiStepContent) "mui-step-content"))
