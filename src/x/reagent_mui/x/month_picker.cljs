(ns reagent-mui.x.month-picker
  "Imports @mui/x-date-pickers/MonthPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/month-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/MonthPicker" :as MuiMonthPicker]))

(def month-picker (adapt-react-class MuiMonthPicker/MonthPicker "mui-month-picker"))
