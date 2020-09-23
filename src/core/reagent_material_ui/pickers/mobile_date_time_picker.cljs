(ns reagent-material-ui.pickers.mobile-date-time-picker
  "Imports @material-ui/pickers/MobileDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MobileDateTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mobile-date-time-picker (adapt-react-class (.-MobileDateTimePicker pickers) "mui-mobile-date-time-picker"))
