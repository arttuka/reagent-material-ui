(ns reagent-mui.x.date-time-picker-pro
  "Imports @mui/x-date-pickers-pro/DateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateTimePicker" :as MuiDateTimePicker]))

(def date-time-picker (r/adapt-react-class MuiDateTimePicker/DateTimePicker))
