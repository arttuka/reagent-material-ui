(ns reagent-material-ui.lab.static-date-picker
  "Imports @material-ui/lab/StaticDatePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/static-date-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/StaticDatePicker" :as MuiStaticDatePicker]))

(def static-date-picker (adapt-react-class (.-default MuiStaticDatePicker) "mui-static-date-picker"))
