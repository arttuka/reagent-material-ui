(ns reagent-mui.x.time-picker
  "Imports @mui/x-date-pickers/TimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/TimePicker" :as MuiTimePicker]))

(def time-picker (r/adapt-react-class MuiTimePicker/TimePicker))
