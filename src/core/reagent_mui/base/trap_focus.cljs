(ns reagent-mui.base.trap-focus
  "Imports @mui/base/TrapFocus as a Reagent component.
   Original documentation is at https://mui.com/base/api/trap-focus/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TrapFocus" :as MuiTrapFocus]))

(def trap-focus (adapt-react-class (.-default MuiTrapFocus) "mui-trap-focus"))
