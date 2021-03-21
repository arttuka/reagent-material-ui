(ns reagent-material-ui.lab.mobile-date-range-picker
  "Imports @material-ui/lab/MobileDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-date-range-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/MobileDateRangePicker" :as MuiMobileDateRangePicker]))

(def mobile-date-range-picker (adapt-react-class (.-default MuiMobileDateRangePicker) "mui-mobile-date-range-picker"))
