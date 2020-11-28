(ns reagent-material-ui.lab.day-picker
  "Imports @material-ui/lab/DayPicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/day-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DayPicker" :as MuiDayPicker]))

(def day-picker (adapt-react-class (or (.-default MuiDayPicker) (.-DayPicker MuiDayPicker)) "mui-day-picker"))
