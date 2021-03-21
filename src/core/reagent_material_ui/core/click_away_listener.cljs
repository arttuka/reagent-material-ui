(ns reagent-material-ui.core.click-away-listener
  "Imports @material-ui/core/ClickAwayListener as a Reagent component.
   Original documentation is at https://material-ui.com/api/click-away-listener/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ClickAwayListener" :as MuiClickAwayListener]))

(def click-away-listener (adapt-react-class (.-default MuiClickAwayListener) "mui-click-away-listener"))
