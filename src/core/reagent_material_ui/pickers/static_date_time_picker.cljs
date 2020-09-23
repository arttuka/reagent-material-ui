(ns reagent-material-ui.pickers.static-date-time-picker
  "Imports @material-ui/pickers/StaticDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/StaticDateTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def static-date-time-picker (adapt-react-class (.-StaticDateTimePicker pickers) "mui-static-date-time-picker"))
