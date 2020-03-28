(ns reagent-material-ui.core.step-content
  "Imports @material-ui/core/StepContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepContent" :as StepContent]))

(def step-content (adapt-react-class (or (.-default StepContent) (.-StepContent StepContent)) "mui-step-content"))
