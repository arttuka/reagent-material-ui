(ns reagent-mui.x.static-date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/StaticDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/StaticDateRangePicker" :as MuiStaticDateRangePicker]))

(def static-date-range-picker (adapt-react-class MuiStaticDateRangePicker/StaticDateRangePicker "mui-static-date-range-picker"))
