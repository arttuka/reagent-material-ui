(ns reagent-material-ui.pickers.mui-pickers-context
  "Imports @material-ui/pickers/MuiPickersContext as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MuiPickersContext/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mui-pickers-context (adapt-react-class (.-MuiPickersContext pickers) "mui-mui-pickers-context"))
