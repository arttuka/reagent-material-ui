(ns reagent-material-ui.lab.pickers-calendar-skeleton
  "Imports @material-ui/lab/PickersCalendarSkeleton as a Reagent component.
   Original documentation is at https://material-ui.com/api/pickers-calendar-skeleton/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/PickersCalendarSkeleton" :as MuiPickersCalendarSkeleton]))

(def pickers-calendar-skeleton (adapt-react-class (or (.-default MuiPickersCalendarSkeleton) (.-PickersCalendarSkeleton MuiPickersCalendarSkeleton)) "mui-pickers-calendar-skeleton"))
