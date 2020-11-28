(ns reagent-material-ui.lab.mobile-date-time-picker
  "Imports @material-ui/lab/MobileDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-date-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/MobileDateTimePicker" :as MuiMobileDateTimePicker]))

(def mobile-date-time-picker (adapt-react-class (or (.-default MuiMobileDateTimePicker) (.-MobileDateTimePicker MuiMobileDateTimePicker)) "mui-mobile-date-time-picker"))
