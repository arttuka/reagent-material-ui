(ns reagent-material-ui.pickers.date-range-picker
  "Imports @material-ui/pickers/DateRangePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DateRangePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def date-range-picker (adapt-react-class (.-DateRangePicker pickers) "mui-date-range-picker"))
