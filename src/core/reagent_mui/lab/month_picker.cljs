(ns reagent-mui.lab.month-picker
  "Imports @mui/lab/MonthPicker as a Reagent component.
   Original documentation is at https://mui.com/api/month-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MonthPicker" :as MuiMonthPicker]))

(def month-picker (adapt-react-class (.-default MuiMonthPicker) "mui-month-picker"))
