(ns reagent-material-ui.pickers.static-time-picker
  "Imports @material-ui/pickers/StaticTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/StaticTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def static-time-picker (adapt-react-class (.-StaticTimePicker pickers) "mui-static-time-picker"))
