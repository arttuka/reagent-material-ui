(ns reagent-mui.x.date-range-calendar-pro
  "Imports @mui/x-date-pickers-pro/DateRangeCalendar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-range-calendar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateRangeCalendar" :as MuiDateRangeCalendar]))

(def date-range-calendar (r/adapt-react-class MuiDateRangeCalendar/DateRangeCalendar))
