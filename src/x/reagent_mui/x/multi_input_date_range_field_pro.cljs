(ns reagent-mui.x.multi-input-date-range-field-pro
  "Imports @mui/x-date-pickers-pro/MultiInputDateRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/multi-input-date-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MultiInputDateRangeField" :as MuiMultiInputDateRangeField]))

(def multi-input-date-range-field (r/adapt-react-class MuiMultiInputDateRangeField/MultiInputDateRangeField))
