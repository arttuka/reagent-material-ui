(ns reagent-material-ui.lab.calendar-picker-skeleton
  "Imports @material-ui/lab/CalendarPickerSkeleton as a Reagent component.
   Original documentation is at https://material-ui.com/api/calendar-picker-skeleton/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/CalendarPickerSkeleton" :as MuiCalendarPickerSkeleton]))

(def calendar-picker-skeleton (adapt-react-class (.-default MuiCalendarPickerSkeleton) "mui-calendar-picker-skeleton"))
