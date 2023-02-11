(ns reagent-mui.x.mobile-date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/MobileDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-date-range-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MobileDateRangePicker" :as MuiMobileDateRangePicker]))

(def mobile-date-range-picker (r/adapt-react-class MuiMobileDateRangePicker/MobileDateRangePicker))
