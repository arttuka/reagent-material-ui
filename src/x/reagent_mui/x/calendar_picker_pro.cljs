(ns reagent-mui.x.calendar-picker-pro
  "Imports @mui/x-date-pickers-pro/CalendarPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/calendar-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/CalendarPicker" :as MuiCalendarPicker]))

(def calendar-picker (adapt-react-class (.-CalendarPicker MuiCalendarPicker) "mui-calendar-picker"))
