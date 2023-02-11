(ns reagent-mui.x.calendar-picker-skeleton-pro
  "Imports @mui/x-date-pickers-pro/CalendarPickerSkeleton as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/calendar-picker-skeleton/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/CalendarPickerSkeleton" :as MuiCalendarPickerSkeleton]))

(def calendar-picker-skeleton (r/adapt-react-class MuiCalendarPickerSkeleton/CalendarPickerSkeleton))
