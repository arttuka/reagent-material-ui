(ns reagent-material-ui.lab.clock-picker
  "Imports @material-ui/lab/ClockPicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/clock-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/ClockPicker" :as MuiClockPicker]))

(def clock-picker (adapt-react-class (or (.-default MuiClockPicker) (.-ClockPicker MuiClockPicker)) "mui-clock-picker"))
