(ns reagent-mui.base.click-away-listener
  "Imports @mui/base/ClickAwayListener as a Reagent component.
   Original documentation is at https://mui.com/base/api/click-away-listener/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/ClickAwayListener" :as MuiClickAwayListener]))

(def click-away-listener (adapt-react-class (.-default MuiClickAwayListener) "mui-click-away-listener"))
