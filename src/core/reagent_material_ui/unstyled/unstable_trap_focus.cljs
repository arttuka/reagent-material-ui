(ns reagent-material-ui.unstyled.unstable-trap-focus
  "Imports @material-ui/unstyled/Unstable_TrapFocus as a Reagent component.
   Original documentation is at https://material-ui.com/api/unstable-trap-focus/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/Unstable_TrapFocus" :as MuiUnstable_TrapFocus]))

(def unstable-trap-focus (adapt-react-class (.-default MuiUnstable_TrapFocus) "mui-unstable-trap-focus"))
