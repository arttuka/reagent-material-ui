(ns reagent-material-ui.core.outlined-input
  "Imports @material-ui/core/OutlinedInput as a Reagent component.
   Original documentation is at https://material-ui.com/api/outlined-input/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def outlined-input (r/adapt-react-class (.-OutlinedInput js/MaterialUI)))
