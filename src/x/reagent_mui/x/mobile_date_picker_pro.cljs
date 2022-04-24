(ns reagent-mui.x.mobile-date-picker-pro
  "Imports @mui/x-date-pickers-pro/MobileDatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/MobileDatePicker" :as MuiMobileDatePicker]))

(def mobile-date-picker (adapt-react-class MuiMobileDatePicker/MobileDatePicker "mui-mobile-date-picker"))
