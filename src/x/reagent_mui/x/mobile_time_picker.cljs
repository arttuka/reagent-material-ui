(ns reagent-mui.x.mobile-time-picker
  "Imports @mui/x-date-pickers/MobileTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/MobileTimePicker" :as MuiMobileTimePicker]))

(def mobile-time-picker (adapt-react-class (.-MobileTimePicker MuiMobileTimePicker) "mui-mobile-time-picker"))
