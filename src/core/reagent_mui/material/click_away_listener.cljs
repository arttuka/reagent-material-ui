(ns reagent-mui.material.click-away-listener
  "Imports @mui/material/ClickAwayListener as a Reagent component.
   Original documentation is at https://mui.com/api/click-away-listener/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ClickAwayListener" :as MuiClickAwayListener]))

(def click-away-listener (adapt-react-class (.-default MuiClickAwayListener) "mui-click-away-listener"))
