(ns reagent-mui.x.mobile-date-picker
  "Imports @mui/x-date-pickers/MobileDatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/MobileDatePicker" :as MuiMobileDatePicker]))

(def mobile-date-picker (adapt-react-class (.-MobileDatePicker MuiMobileDatePicker) "mui-mobile-date-picker"))
