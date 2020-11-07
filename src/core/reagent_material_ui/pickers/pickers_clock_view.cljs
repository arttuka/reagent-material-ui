(ns reagent-material-ui.pickers.pickers-clock-view
  "Imports @material-ui/pickers/PickersClockView as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersClockView/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-clock-view (adapt-react-class (.-PickersClockView pickers) "mui-pickers-clock-view"))
