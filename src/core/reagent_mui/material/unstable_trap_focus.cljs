(ns reagent-mui.material.unstable-trap-focus
  "Imports @mui/material/Unstable_TrapFocus as a Reagent component.
   Original documentation is at https://mui.com/api/unstable-trap-focus/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Unstable_TrapFocus" :as MuiUnstable_TrapFocus]))

(def unstable-trap-focus (adapt-react-class (.-default MuiUnstable_TrapFocus) "mui-unstable-trap-focus"))
