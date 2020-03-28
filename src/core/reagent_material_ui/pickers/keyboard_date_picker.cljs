(ns reagent-material-ui.pickers.keyboard-date-picker
  "Imports @material-ui/pickers/KeyboardDatePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/KeyboardDatePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def keyboard-date-picker (adapt-react-class (.-KeyboardDatePicker pickers) "mui-keyboard-date-picker"))
