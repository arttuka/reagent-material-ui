(ns reagent-mui.x.multi-input-time-range-field-pro
  "Imports @mui/x-date-pickers-pro/MultiInputTimeRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/multi-input-time-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MultiInputTimeRangeField" :as MuiMultiInputTimeRangeField]))

(def multi-input-time-range-field (r/adapt-react-class MuiMultiInputTimeRangeField/MultiInputTimeRangeField))
