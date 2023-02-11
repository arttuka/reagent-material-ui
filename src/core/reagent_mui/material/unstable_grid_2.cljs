(ns reagent-mui.material.unstable-grid-2
  "Imports @mui/material/Unstable_Grid2 as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/unstable-grid-2/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Unstable_Grid2" :as MuiUnstable_Grid2]))

(def unstable-grid-2 (r/adapt-react-class (.-default MuiUnstable_Grid2)))
