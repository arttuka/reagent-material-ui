(ns reagent-mui.x.date-field-pro
  "Imports @mui/x-date-pickers-pro/DateField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DateField" :as MuiDateField]))

(def date-field (r/adapt-react-class MuiDateField/DateField))
