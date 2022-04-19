(ns reagent-mui.x.date-picker
  "Imports @mui/x-date-pickers/DatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/DatePicker" :as MuiDatePicker]))

(def date-picker (adapt-react-class (.-DatePicker MuiDatePicker) "mui-date-picker"))
