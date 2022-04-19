(ns reagent-mui.x.month-picker-pro
  "Imports @mui/x-date-pickers-pro/MonthPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/month-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/MonthPicker" :as MuiMonthPicker]))

(def month-picker (adapt-react-class (.-MonthPicker MuiMonthPicker) "mui-month-picker"))
