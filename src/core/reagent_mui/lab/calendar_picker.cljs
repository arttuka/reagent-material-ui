(ns reagent-mui.lab.calendar-picker
  "Imports @mui/lab/CalendarPicker as a Reagent component.
   Original documentation is at https://mui.com/api/calendar-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/CalendarPicker" :as MuiCalendarPicker]))

(def calendar-picker (adapt-react-class (.-default MuiCalendarPicker) "mui-calendar-picker"))
