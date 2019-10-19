(ns reagent-material-ui.core.chip
  "Imports @material-ui/core/Chip as a Reagent component.
   Original documentation is at https://material-ui.com/api/chip/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def chip (adapt-react-class (.-Chip js/MaterialUI) "mui-chip"))
