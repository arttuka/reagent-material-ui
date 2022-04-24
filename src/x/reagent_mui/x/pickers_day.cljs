(ns reagent-mui.x.pickers-day
  "Imports @mui/x-date-pickers/PickersDay as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/pickers-day/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/PickersDay" :as MuiPickersDay]))

(def pickers-day (adapt-react-class MuiPickersDay/PickersDay "mui-pickers-day"))
