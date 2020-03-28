(ns reagent-material-ui.pickers.time-picker
  "Imports @material-ui/pickers/TimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/TimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def time-picker (adapt-react-class (.-TimePicker pickers) "mui-time-picker"))
