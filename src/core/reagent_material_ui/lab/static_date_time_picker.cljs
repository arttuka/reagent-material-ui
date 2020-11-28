(ns reagent-material-ui.lab.static-date-time-picker
  "Imports @material-ui/lab/StaticDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/static-date-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/StaticDateTimePicker" :as MuiStaticDateTimePicker]))

(def static-date-time-picker (adapt-react-class (or (.-default MuiStaticDateTimePicker) (.-StaticDateTimePicker MuiStaticDateTimePicker)) "mui-static-date-time-picker"))
