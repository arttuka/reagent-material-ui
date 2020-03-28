(ns reagent-material-ui.pickers.time-picker-view
  "Imports @material-ui/pickers/TimePickerView as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/TimePickerView/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def time-picker-view (adapt-react-class (.-TimePickerView pickers) "mui-time-picker-view"))
