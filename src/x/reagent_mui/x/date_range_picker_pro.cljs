(ns reagent-mui.x.date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/DateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/DateRangePicker" :as MuiDateRangePicker]))

(def date-range-picker (adapt-react-class MuiDateRangePicker/DateRangePicker "mui-date-range-picker"))
