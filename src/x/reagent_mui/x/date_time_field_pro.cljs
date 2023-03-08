(ns reagent-mui.x.date-time-field-pro
  "Imports @mui/x-date-pickers-pro/DateTimeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-time-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateTimeField" :as MuiDateTimeField]))

(def date-time-field (r/adapt-react-class MuiDateTimeField/DateTimeField))
