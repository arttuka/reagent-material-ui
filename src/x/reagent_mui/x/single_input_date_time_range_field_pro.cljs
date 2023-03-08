(ns reagent-mui.x.single-input-date-time-range-field-pro
  "Imports @mui/x-date-pickers-pro/SingleInputDateTimeRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/single-input-date-time-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/SingleInputDateTimeRangeField" :as MuiSingleInputDateTimeRangeField]))

(def single-input-date-time-range-field (r/adapt-react-class MuiSingleInputDateTimeRangeField/SingleInputDateTimeRangeField))
