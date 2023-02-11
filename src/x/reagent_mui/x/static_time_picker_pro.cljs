(ns reagent-mui.x.static-time-picker-pro
  "Imports @mui/x-date-pickers-pro/StaticTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/StaticTimePicker" :as MuiStaticTimePicker]))

(def static-time-picker (r/adapt-react-class MuiStaticTimePicker/StaticTimePicker))
