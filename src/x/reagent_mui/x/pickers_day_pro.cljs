(ns reagent-mui.x.pickers-day-pro
  "Imports @mui/x-date-pickers-pro/PickersDay as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/pickers-day/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/PickersDay" :as MuiPickersDay]))

(def pickers-day (adapt-react-class (.-PickersDay MuiPickersDay) "mui-pickers-day"))
