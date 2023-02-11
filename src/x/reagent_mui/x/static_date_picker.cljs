(ns reagent-mui.x.static-date-picker
  "Imports @mui/x-date-pickers/StaticDatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-date-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/StaticDatePicker" :as MuiStaticDatePicker]))

(def static-date-picker (r/adapt-react-class MuiStaticDatePicker/StaticDatePicker))
