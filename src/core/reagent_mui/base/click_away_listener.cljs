(ns reagent-mui.base.click-away-listener
  "Imports @mui/base/ClickAwayListener as a Reagent component.
   Original documentation is at https://mui.com/base/api/click-away-listener/ ."
  (:require [reagent.core :as r]
            ["@mui/base/ClickAwayListener" :as MuiClickAwayListener]))

(def click-away-listener (r/adapt-react-class (.-default MuiClickAwayListener)))
