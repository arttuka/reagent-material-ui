(ns reagent-mui.x.mobile-date-time-picker-pro
  "Imports @mui/x-date-pickers-pro/MobileDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/MobileDateTimePicker" :as MuiMobileDateTimePicker]))

(def mobile-date-time-picker (adapt-react-class (.-MobileDateTimePicker MuiMobileDateTimePicker) "mui-mobile-date-time-picker"))
