(ns reagent-mui.x.calendar-picker-pro
  "Imports @mui/x-date-pickers-pro/CalendarPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/calendar-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/CalendarPicker" :as MuiCalendarPicker]))

(def calendar-picker (r/adapt-react-class MuiCalendarPicker/CalendarPicker))
