(ns reagent-mui.x.mobile-time-picker-pro
  "Imports @mui/x-date-pickers-pro/MobileTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/MobileTimePicker" :as MuiMobileTimePicker]))

(def mobile-time-picker (r/adapt-react-class MuiMobileTimePicker/MobileTimePicker))
