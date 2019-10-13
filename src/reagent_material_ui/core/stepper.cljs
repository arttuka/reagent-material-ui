(ns reagent-material-ui.core.stepper
  "Imports @material-ui/core/Stepper as a Reagent component.
   Original documentation is at https://material-ui.com/api/stepper/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def stepper (r/adapt-react-class (.-Stepper js/MaterialUI)))
