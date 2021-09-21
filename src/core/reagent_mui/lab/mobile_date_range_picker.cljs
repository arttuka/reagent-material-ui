(ns reagent-mui.lab.mobile-date-range-picker
  "Imports @mui/lab/MobileDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/api/mobile-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MobileDateRangePicker" :as MuiMobileDateRangePicker]))

(def mobile-date-range-picker (adapt-react-class (.-default MuiMobileDateRangePicker) "mui-mobile-date-range-picker"))
