(ns reagent-mui.x.date-time-picker
  "Imports @mui/x-date-pickers/DateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/DateTimePicker" :as MuiDateTimePicker]))

(def date-time-picker (adapt-react-class MuiDateTimePicker/DateTimePicker "mui-date-time-picker"))
