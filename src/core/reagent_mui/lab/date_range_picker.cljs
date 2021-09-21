(ns reagent-mui.lab.date-range-picker
  "Imports @mui/lab/DateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/api/date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DateRangePicker" :as MuiDateRangePicker]))

(def date-range-picker (adapt-react-class (.-default MuiDateRangePicker) "mui-date-range-picker"))
