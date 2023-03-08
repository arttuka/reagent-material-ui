(ns reagent-mui.x.time-clock
  "Imports @mui/x-date-pickers/TimeClock as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-clock/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/TimeClock" :as MuiTimeClock]))

(def time-clock (r/adapt-react-class MuiTimeClock/TimeClock))
