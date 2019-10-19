(ns reagent-material-ui.core.step-label
  "Imports @material-ui/core/StepLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def step-label (adapt-react-class (.-StepLabel js/MaterialUI) "mui-step-label"))
