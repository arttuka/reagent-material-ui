(ns reagent-material-ui.core.step-button
  "Imports @material-ui/core/StepButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/step-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def step-button (adapt-react-class (.-StepButton js/MaterialUI) "mui-step-button"))
