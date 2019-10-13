(ns reagent-material-ui.core.chip
  "Imports @material-ui/core/Chip as a Reagent component.
   Original documentation is at https://material-ui.com/api/chip/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def chip (r/adapt-react-class (.-Chip js/MaterialUI)))
