(ns reagent-material-ui.lab.pickers-day
  "Imports @material-ui/lab/PickersDay as a Reagent component.
   Original documentation is at https://material-ui.com/api/pickers-day/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/PickersDay" :as MuiPickersDay]))

(def pickers-day (adapt-react-class (or (.-default MuiPickersDay) (.-PickersDay MuiPickersDay)) "mui-pickers-day"))
