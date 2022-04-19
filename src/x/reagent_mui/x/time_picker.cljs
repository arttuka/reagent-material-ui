(ns reagent-mui.x.time-picker
  "Imports @mui/x-date-pickers/TimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/TimePicker" :as MuiTimePicker]))

(def time-picker (adapt-react-class (.-TimePicker MuiTimePicker) "mui-time-picker"))
