(ns reagent-mui.x.clock-picker-pro
  "Imports @mui/x-date-pickers-pro/ClockPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/clock-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/ClockPicker" :as MuiClockPicker]))

(def clock-picker (r/adapt-react-class MuiClockPicker/ClockPicker))
