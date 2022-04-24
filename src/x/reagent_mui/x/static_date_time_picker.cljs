(ns reagent-mui.x.static-date-time-picker
  "Imports @mui/x-date-pickers/StaticDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/StaticDateTimePicker" :as MuiStaticDateTimePicker]))

(def static-date-time-picker (adapt-react-class MuiStaticDateTimePicker/StaticDateTimePicker "mui-static-date-time-picker"))
