(ns reagent-mui.x.pickers-shortcuts-pro
  "Imports @mui/x-date-pickers-pro/PickersShortcuts as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/pickers-shortcuts/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/PickersShortcuts" :as MuiPickersShortcuts]))

(def pickers-shortcuts (r/adapt-react-class MuiPickersShortcuts/PickersShortcuts))
