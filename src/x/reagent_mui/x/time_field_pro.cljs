(ns reagent-mui.x.time-field-pro
  "Imports @mui/x-date-pickers-pro/TimeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/time-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/TimeField" :as MuiTimeField]))

(def time-field (r/adapt-react-class MuiTimeField/TimeField))
