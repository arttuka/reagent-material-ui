(ns reagent-mui.lab.mobile-date-time-picker
  "Imports @mui/lab/MobileDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/mobile-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MobileDateTimePicker" :as MuiMobileDateTimePicker]))

(def mobile-date-time-picker (adapt-react-class (.-default MuiMobileDateTimePicker) "mui-mobile-date-time-picker"))
