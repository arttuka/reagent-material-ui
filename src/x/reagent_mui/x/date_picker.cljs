(ns reagent-mui.x.date-picker
  "Imports @mui/x-date-pickers/DatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/DatePicker" :as MuiDatePicker]))

(def date-picker (r/adapt-react-class MuiDatePicker/DatePicker))
