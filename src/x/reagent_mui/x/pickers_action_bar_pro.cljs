(ns reagent-mui.x.pickers-action-bar-pro
  "Imports @mui/x-date-pickers-pro/PickersActionBar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/pickers-action-bar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/PickersActionBar" :as MuiPickersActionBar]))

(def pickers-action-bar (r/adapt-react-class MuiPickersActionBar/PickersActionBar))
