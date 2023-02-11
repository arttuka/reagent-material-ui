(ns reagent-mui.material.mobile-stepper
  "Imports @mui/material/MobileStepper as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/mobile-stepper/ ."
  (:require [reagent.core :as r]
            ["@mui/material/MobileStepper" :as MuiMobileStepper]))

(def mobile-stepper (r/adapt-react-class (.-default MuiMobileStepper)))
