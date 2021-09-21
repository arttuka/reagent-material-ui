(ns reagent-mui.lab.calendar-picker-skeleton
  "Imports @mui/lab/CalendarPickerSkeleton as a Reagent component.
   Original documentation is at https://mui.com/api/calendar-picker-skeleton/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/CalendarPickerSkeleton" :as MuiCalendarPickerSkeleton]))

(def calendar-picker-skeleton (adapt-react-class (.-default MuiCalendarPickerSkeleton) "mui-calendar-picker-skeleton"))
