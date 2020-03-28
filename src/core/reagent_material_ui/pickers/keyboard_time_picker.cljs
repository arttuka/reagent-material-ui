(ns reagent-material-ui.pickers.keyboard-time-picker
  "Imports @material-ui/pickers/KeyboardTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/KeyboardTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def keyboard-time-picker (adapt-react-class (.-KeyboardTimePicker pickers) "mui-keyboard-time-picker"))
