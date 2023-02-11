(ns reagent-mui.material.chip
  "Imports @mui/material/Chip as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/chip/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Chip" :as MuiChip]))

(def chip (r/adapt-react-class (.-default MuiChip)))
