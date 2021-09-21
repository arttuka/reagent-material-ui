(ns reagent-mui.material.mobile-stepper
  "Imports @mui/material/MobileStepper as a Reagent component.
   Original documentation is at https://mui.com/api/mobile-stepper/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/MobileStepper" :as MuiMobileStepper]))

(def mobile-stepper (adapt-react-class (.-default MuiMobileStepper) "mui-mobile-stepper"))
