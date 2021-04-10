(ns reagent-material-ui.core.stepper
  "Imports @material-ui/core/Stepper as a Reagent component.
   Original documentation is at https://material-ui.com/api/stepper/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Stepper" :as MuiStepper]))

(def stepper (adapt-react-class (.-default MuiStepper) "mui-stepper"))
