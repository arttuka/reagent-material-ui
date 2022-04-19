(ns reagent-mui.material.chip
  "Imports @mui/material/Chip as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/chip/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Chip" :as MuiChip]))

(def chip (adapt-react-class (.-default MuiChip) "mui-chip"))
