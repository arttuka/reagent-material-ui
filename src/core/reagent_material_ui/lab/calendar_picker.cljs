(ns reagent-material-ui.lab.calendar-picker
  "Imports @material-ui/lab/CalendarPicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/calendar-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/CalendarPicker" :as MuiCalendarPicker]))

(def calendar-picker (adapt-react-class (.-default MuiCalendarPicker) "mui-calendar-picker"))
