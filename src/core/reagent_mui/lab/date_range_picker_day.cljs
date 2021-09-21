(ns reagent-mui.lab.date-range-picker-day
  "Imports @mui/lab/DateRangePickerDay as a Reagent component.
   Original documentation is at https://mui.com/api/date-range-picker-day/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DateRangePickerDay" :as MuiDateRangePickerDay]))

(def date-range-picker-day (adapt-react-class (.-default MuiDateRangePickerDay) "mui-date-range-picker-day"))
