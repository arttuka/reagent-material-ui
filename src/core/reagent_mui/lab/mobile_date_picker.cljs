(ns reagent-mui.lab.mobile-date-picker
  "Imports @mui/lab/MobileDatePicker as a Reagent component.
   Original documentation is at https://mui.com/api/mobile-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MobileDatePicker" :as MuiMobileDatePicker]))

(def mobile-date-picker (adapt-react-class (.-default MuiMobileDatePicker) "mui-mobile-date-picker"))
