(ns reagent-material-ui.core.chip
  "Imports @material-ui/core/Chip as a Reagent component.
   Original documentation is at https://material-ui.com/api/chip/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Chip" :as MuiChip]))

(def chip (adapt-react-class (.-default MuiChip) "mui-chip"))
