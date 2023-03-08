(ns reagent-mui.x.year-calendar
  "Imports @mui/x-date-pickers/YearCalendar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/year-calendar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/YearCalendar" :as MuiYearCalendar]))

(def year-calendar (r/adapt-react-class MuiYearCalendar/YearCalendar))
