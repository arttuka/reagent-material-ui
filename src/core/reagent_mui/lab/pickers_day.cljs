(ns reagent-mui.lab.pickers-day
  "Imports @mui/lab/PickersDay as a Reagent component.
   Original documentation is at https://mui.com/api/pickers-day/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/PickersDay" :as MuiPickersDay]))

(def pickers-day (adapt-react-class (.-default MuiPickersDay) "mui-pickers-day"))
