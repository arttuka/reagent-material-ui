(ns reagent-material-ui.core.mobile-stepper
  "Imports @material-ui/core/MobileStepper as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-stepper/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/MobileStepper" :as MuiMobileStepper]))

(def mobile-stepper (adapt-react-class (.-default MuiMobileStepper) "mui-mobile-stepper"))
