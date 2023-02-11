(ns reagent-mui.x.static-date-time-picker-pro
  "Imports @mui/x-date-pickers-pro/StaticDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-date-time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/StaticDateTimePicker" :as MuiStaticDateTimePicker]))

(def static-date-time-picker (r/adapt-react-class MuiStaticDateTimePicker/StaticDateTimePicker))
