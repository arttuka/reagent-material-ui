(ns reagent-mui.x.day-calendar-skeleton
  "Imports @mui/x-date-pickers/DayCalendarSkeleton as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/day-calendar-skeleton/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/DayCalendarSkeleton" :as MuiDayCalendarSkeleton]))

(def day-calendar-skeleton (r/adapt-react-class MuiDayCalendarSkeleton/DayCalendarSkeleton))
