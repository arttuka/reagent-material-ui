(ns reagent-mui.x.month-calendar-pro
  "Imports @mui/x-date-pickers-pro/MonthCalendar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/month-calendar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MonthCalendar" :as MuiMonthCalendar]))

(def month-calendar (r/adapt-react-class MuiMonthCalendar/MonthCalendar))
