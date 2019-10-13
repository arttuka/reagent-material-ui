(ns reagent-material-ui.core.mobile-stepper
  "Imports @material-ui/core/MobileStepper as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-stepper/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def mobile-stepper (r/adapt-react-class (.-MobileStepper js/MaterialUI)))
