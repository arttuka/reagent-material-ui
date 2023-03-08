(ns reagent-mui.x.time-field
  "Imports @mui/x-date-pickers/TimeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/TimeField" :as MuiTimeField]))

(def time-field (r/adapt-react-class MuiTimeField/TimeField))
