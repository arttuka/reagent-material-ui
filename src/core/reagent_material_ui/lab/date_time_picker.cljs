(ns reagent-material-ui.lab.date-time-picker
  "Imports @material-ui/lab/DateTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/date-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DateTimePicker" :as MuiDateTimePicker]))

(def date-time-picker (adapt-react-class (or (.-default MuiDateTimePicker) (.-DateTimePicker MuiDateTimePicker)) "mui-date-time-picker"))
