(ns reagent-material-ui.pickers.pickers-day
  "Imports @material-ui/pickers/PickersDay as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersDay/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-day (adapt-react-class (.-PickersDay pickers) "mui-pickers-day"))
