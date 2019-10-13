(ns reagent-material-ui.core.step
  "Imports @material-ui/core/Step as a Reagent component.
   Original documentation is at https://material-ui.com/api/step/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def step (r/adapt-react-class (.-Step js/MaterialUI)))
