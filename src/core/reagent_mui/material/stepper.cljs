(ns reagent-mui.material.stepper
  "Imports @mui/material/Stepper as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/stepper/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Stepper" :as MuiStepper]))

(def stepper (r/adapt-react-class (.-default MuiStepper)))
