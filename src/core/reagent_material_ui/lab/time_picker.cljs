(ns reagent-material-ui.lab.time-picker
  "Imports @material-ui/lab/TimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimePicker" :as MuiTimePicker]))

(def time-picker (adapt-react-class (.-default MuiTimePicker) "mui-time-picker"))
