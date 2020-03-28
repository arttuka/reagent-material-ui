(ns reagent-material-ui.pickers.keyboard-date-time-picker
  "Imports @material-ui/pickers/KeyboardDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/KeyboardDateTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def keyboard-date-time-picker (adapt-react-class (.-KeyboardDateTimePicker pickers) "mui-keyboard-date-time-picker"))
