(ns reagent-mui.material.stepper
  "Imports @mui/material/Stepper as a Reagent component.
   Original documentation is at https://mui.com/api/stepper/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Stepper" :as MuiStepper]))

(def stepper (adapt-react-class (.-default MuiStepper) "mui-stepper"))
