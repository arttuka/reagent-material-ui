(ns reagent-material-ui.pickers.pickers-base-pickers
  "Imports @material-ui/pickers/PickersBasePickers as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersBasePickers/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-base-pickers (adapt-react-class (.-PickersBasePickers pickers) "mui-pickers-base-pickers"))
