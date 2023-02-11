(ns reagent-mui.material.unstable-trap-focus
  "Imports @mui/material/Unstable_TrapFocus as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/unstable-trap-focus/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Unstable_TrapFocus" :as MuiUnstable_TrapFocus]))

(def unstable-trap-focus (r/adapt-react-class (.-default MuiUnstable_TrapFocus)))
