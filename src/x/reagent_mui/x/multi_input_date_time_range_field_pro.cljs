(ns reagent-mui.x.multi-input-date-time-range-field-pro
  "Imports @mui/x-date-pickers-pro/MultiInputDateTimeRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/multi-input-date-time-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MultiInputDateTimeRangeField" :as MuiMultiInputDateTimeRangeField]))

(def multi-input-date-time-range-field (r/adapt-react-class MuiMultiInputDateTimeRangeField/MultiInputDateTimeRangeField))
