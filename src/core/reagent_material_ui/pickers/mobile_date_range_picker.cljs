(ns reagent-material-ui.pickers.mobile-date-range-picker
  "Imports @material-ui/pickers/MobileDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MobileDateRangePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mobile-date-range-picker (adapt-react-class (.-MobileDateRangePicker pickers) "mui-mobile-date-range-picker"))
