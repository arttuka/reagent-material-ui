(ns reagent-mui.x.date-range-picker-toolbar-pro
  "Imports @mui/x-date-pickers-pro/DateRangePickerToolbar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-range-picker-toolbar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateRangePickerToolbar" :as MuiDateRangePickerToolbar]))

(def date-range-picker-toolbar (r/adapt-react-class MuiDateRangePickerToolbar/DateRangePickerToolbar))
