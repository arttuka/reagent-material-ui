(ns reagent-mui.x.single-input-time-range-field-pro
  "Imports @mui/x-date-pickers-pro/SingleInputTimeRangeField as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/single-input-time-range-field/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/SingleInputTimeRangeField" :as MuiSingleInputTimeRangeField]))

(def single-input-time-range-field (r/adapt-react-class MuiSingleInputTimeRangeField/SingleInputTimeRangeField))
