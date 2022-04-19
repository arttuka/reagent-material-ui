(ns reagent-mui.x.mobile-date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/MobileDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/mobile-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/MobileDateRangePicker" :as MuiMobileDateRangePicker]))

(def mobile-date-range-picker (adapt-react-class (.-MobileDateRangePicker MuiMobileDateRangePicker) "mui-mobile-date-range-picker"))
