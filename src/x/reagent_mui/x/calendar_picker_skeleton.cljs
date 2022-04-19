(ns reagent-mui.x.calendar-picker-skeleton
  "Imports @mui/x-date-pickers/CalendarPickerSkeleton as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/calendar-picker-skeleton/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/CalendarPickerSkeleton" :as MuiCalendarPickerSkeleton]))

(def calendar-picker-skeleton (adapt-react-class (.-CalendarPickerSkeleton MuiCalendarPickerSkeleton) "mui-calendar-picker-skeleton"))
