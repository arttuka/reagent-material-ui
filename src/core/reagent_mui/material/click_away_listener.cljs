(ns reagent-mui.material.click-away-listener
  "Imports @mui/material/ClickAwayListener as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/click-away-listener/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ClickAwayListener" :as MuiClickAwayListener]))

(def click-away-listener (r/adapt-react-class (.-default MuiClickAwayListener)))
