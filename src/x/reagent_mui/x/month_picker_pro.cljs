(ns reagent-mui.x.month-picker-pro
  "Imports @mui/x-date-pickers-pro/MonthPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/month-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MonthPicker" :as MuiMonthPicker]))

(def month-picker (r/adapt-react-class MuiMonthPicker/MonthPicker))
