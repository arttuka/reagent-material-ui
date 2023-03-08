(ns reagent-mui.x.date-time-picker-toolbar
  "Imports @mui/x-date-pickers/DateTimePickerToolbar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-time-picker-toolbar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/DateTimePickerToolbar" :as MuiDateTimePickerToolbar]))

(def date-time-picker-toolbar (r/adapt-react-class MuiDateTimePickerToolbar/DateTimePickerToolbar))
