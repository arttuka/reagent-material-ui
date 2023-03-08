(ns reagent-mui.x.time-picker-toolbar-pro
  "Imports @mui/x-date-pickers-pro/TimePickerToolbar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-picker-toolbar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/TimePickerToolbar" :as MuiTimePickerToolbar]))

(def time-picker-toolbar (r/adapt-react-class MuiTimePickerToolbar/TimePickerToolbar))
