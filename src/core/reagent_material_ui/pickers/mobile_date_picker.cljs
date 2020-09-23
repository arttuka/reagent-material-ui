(ns reagent-material-ui.pickers.mobile-date-picker
  "Imports @material-ui/pickers/MobileDatePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MobileDatePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mobile-date-picker (adapt-react-class (.-MobileDatePicker pickers) "mui-mobile-date-picker"))
