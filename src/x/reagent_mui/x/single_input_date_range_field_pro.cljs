(ns reagent-mui.x.single-input-date-range-field-pro
  "Imports @mui/x-date-pickers-pro/SingleInputDateRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/single-input-date-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/SingleInputDateRangeField" :as MuiSingleInputDateRangeField]))

(def single-input-date-range-field (r/adapt-react-class MuiSingleInputDateRangeField/SingleInputDateRangeField))
