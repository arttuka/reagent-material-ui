(ns reagent-mui.lab.static-date-range-picker
  "Imports @mui/lab/StaticDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/api/static-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/StaticDateRangePicker" :as MuiStaticDateRangePicker]))

(def static-date-range-picker (adapt-react-class (.-default MuiStaticDateRangePicker) "mui-static-date-range-picker"))
