(ns reagent-mui.x.date-calendar
  "Imports @mui/x-date-pickers/DateCalendar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-calendar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/DateCalendar" :as MuiDateCalendar]))

(def date-calendar (r/adapt-react-class MuiDateCalendar/DateCalendar))
