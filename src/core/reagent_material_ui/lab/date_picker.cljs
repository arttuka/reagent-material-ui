(ns reagent-material-ui.lab.date-picker
  "Imports @material-ui/lab/DatePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/date-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DatePicker" :as MuiDatePicker]))

(def date-picker (adapt-react-class (or (.-default MuiDatePicker) (.-DatePicker MuiDatePicker)) "mui-date-picker"))
