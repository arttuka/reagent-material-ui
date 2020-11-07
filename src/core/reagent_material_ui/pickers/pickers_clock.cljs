(ns reagent-material-ui.pickers.pickers-clock
  "Imports @material-ui/pickers/PickersClock as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersClock/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-clock (adapt-react-class (.-PickersClock pickers) "mui-pickers-clock"))
