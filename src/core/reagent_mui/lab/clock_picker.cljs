(ns reagent-mui.lab.clock-picker
  "Imports @mui/lab/ClockPicker as a Reagent component.
   Original documentation is at https://mui.com/api/clock-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/ClockPicker" :as MuiClockPicker]))

(def clock-picker (adapt-react-class (.-default MuiClockPicker) "mui-clock-picker"))
