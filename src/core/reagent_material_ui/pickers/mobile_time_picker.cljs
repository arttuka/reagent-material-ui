(ns reagent-material-ui.pickers.mobile-time-picker
  "Imports @material-ui/pickers/MobileTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MobileTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mobile-time-picker (adapt-react-class (.-MobileTimePicker pickers) "mui-mobile-time-picker"))
