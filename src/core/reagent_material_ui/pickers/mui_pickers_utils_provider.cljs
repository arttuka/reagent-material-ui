(ns reagent-material-ui.pickers.mui-pickers-utils-provider
  "Imports @material-ui/pickers/MuiPickersUtilsProvider as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/MuiPickersUtilsProvider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def mui-pickers-utils-provider (adapt-react-class (.-MuiPickersUtilsProvider pickers) "mui-mui-pickers-utils-provider"))
