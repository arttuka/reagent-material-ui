(ns reagent-mui.x.date-range-picker-day-pro
  "Imports @mui/x-date-pickers-pro/DateRangePickerDay as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-range-picker-day/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/DateRangePickerDay" :as MuiDateRangePickerDay]))

(def date-range-picker-day (adapt-react-class MuiDateRangePickerDay/DateRangePickerDay "mui-date-range-picker-day"))
