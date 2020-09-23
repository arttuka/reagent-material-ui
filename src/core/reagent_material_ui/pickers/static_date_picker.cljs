(ns reagent-material-ui.pickers.static-date-picker
  "Imports @material-ui/pickers/StaticDatePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/StaticDatePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def static-date-picker (adapt-react-class (.-StaticDatePicker pickers) "mui-static-date-picker"))
