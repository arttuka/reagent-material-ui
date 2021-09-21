(ns reagent-mui.lab.mobile-time-picker
  "Imports @mui/lab/MobileTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/mobile-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MobileTimePicker" :as MuiMobileTimePicker]))

(def mobile-time-picker (adapt-react-class (.-default MuiMobileTimePicker) "mui-mobile-time-picker"))
