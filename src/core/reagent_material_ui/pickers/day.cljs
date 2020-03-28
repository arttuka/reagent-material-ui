(ns reagent-material-ui.pickers.day
  "Imports @material-ui/pickers/Day as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/Day/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def day (adapt-react-class (.-Day pickers) "mui-day"))
