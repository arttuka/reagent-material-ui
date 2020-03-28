(ns reagent-material-ui.core.step-button
  "Imports @material-ui/core/StepButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/StepButton" :as StepButton]))

(def step-button (adapt-react-class (or (.-default StepButton) (.-StepButton StepButton)) "mui-step-button"))
