(ns reagent-material-ui.lab.static-date-range-picker
  "Imports @material-ui/lab/StaticDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/static-date-range-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/StaticDateRangePicker" :as MuiStaticDateRangePicker]))

(def static-date-range-picker (adapt-react-class (.-default MuiStaticDateRangePicker) "mui-static-date-range-picker"))
