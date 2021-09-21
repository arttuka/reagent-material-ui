(ns reagent-mui.lab.date-time-picker
  "Imports @mui/lab/DateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DateTimePicker" :as MuiDateTimePicker]))

(def date-time-picker (adapt-react-class (.-default MuiDateTimePicker) "mui-date-time-picker"))
