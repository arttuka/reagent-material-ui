(ns reagent-material-ui.pickers.date-time-picker
  "Imports @material-ui/pickers/DateTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DateTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def date-time-picker (adapt-react-class (.-DateTimePicker pickers) "mui-date-time-picker"))
