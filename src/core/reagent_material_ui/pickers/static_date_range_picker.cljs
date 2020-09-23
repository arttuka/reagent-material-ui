(ns reagent-material-ui.pickers.static-date-range-picker
  "Imports @material-ui/pickers/StaticDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/StaticDateRangePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def static-date-range-picker (adapt-react-class (.-StaticDateRangePicker pickers) "mui-static-date-range-picker"))
