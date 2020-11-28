(ns reagent-material-ui.lab.mobile-date-picker
  "Imports @material-ui/lab/MobileDatePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-date-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/MobileDatePicker" :as MuiMobileDatePicker]))

(def mobile-date-picker (adapt-react-class (or (.-default MuiMobileDatePicker) (.-MobileDatePicker MuiMobileDatePicker)) "mui-mobile-date-picker"))
