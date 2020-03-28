(ns reagent-material-ui.pickers.clock-view
  "Imports @material-ui/pickers/ClockView as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/ClockView/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def clock-view (adapt-react-class (.-ClockView pickers) "mui-clock-view"))
