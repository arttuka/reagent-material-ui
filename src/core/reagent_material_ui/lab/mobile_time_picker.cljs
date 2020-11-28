(ns reagent-material-ui.lab.mobile-time-picker
  "Imports @material-ui/lab/MobileTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/mobile-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/MobileTimePicker" :as MuiMobileTimePicker]))

(def mobile-time-picker (adapt-react-class (or (.-default MuiMobileTimePicker) (.-MobileTimePicker MuiMobileTimePicker)) "mui-mobile-time-picker"))
