(ns reagent-mui.x.date-time-picker-tabs-pro
  "Imports @mui/x-date-pickers-pro/DateTimePickerTabs as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-time-picker-tabs/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateTimePickerTabs" :as MuiDateTimePickerTabs]))

(def date-time-picker-tabs (r/adapt-react-class MuiDateTimePickerTabs/DateTimePickerTabs))
