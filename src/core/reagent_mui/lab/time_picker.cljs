(ns reagent-mui.lab.time-picker
  "Imports @mui/lab/TimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimePicker" :as MuiTimePicker]))

(def time-picker (adapt-react-class (.-default MuiTimePicker) "mui-time-picker"))
