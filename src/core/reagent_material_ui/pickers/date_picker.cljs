(ns reagent-material-ui.pickers.date-picker
  "Imports @material-ui/pickers/DatePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DatePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def date-picker (adapt-react-class (.-DatePicker pickers) "mui-date-picker"))
