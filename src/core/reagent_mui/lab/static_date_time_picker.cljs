(ns reagent-mui.lab.static-date-time-picker
  "Imports @mui/lab/StaticDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/static-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/StaticDateTimePicker" :as MuiStaticDateTimePicker]))

(def static-date-time-picker (adapt-react-class (.-default MuiStaticDateTimePicker) "mui-static-date-time-picker"))
