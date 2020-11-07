(ns reagent-material-ui.core.unstable-trap-focus
  "Imports @material-ui/core/Unstable_TrapFocus as a Reagent component.
   Original documentation is at https://material-ui.com/api/unstable-trap-focus/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Unstable_TrapFocus" :as MuiUnstable_TrapFocus]))

(def unstable-trap-focus (adapt-react-class (or (.-default MuiUnstable_TrapFocus) (.-Unstable_TrapFocus MuiUnstable_TrapFocus)) "mui-unstable-trap-focus"))
