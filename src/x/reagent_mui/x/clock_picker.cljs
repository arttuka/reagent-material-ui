(ns reagent-mui.x.clock-picker
  "Imports @mui/x-date-pickers/ClockPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/clock-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/ClockPicker" :as MuiClockPicker]))

(def clock-picker (adapt-react-class MuiClockPicker/ClockPicker "mui-clock-picker"))
