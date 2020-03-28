(ns reagent-material-ui.pickers.clock
  "Imports @material-ui/pickers/Clock as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/Clock/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def clock (adapt-react-class (.-Clock pickers) "mui-clock"))
