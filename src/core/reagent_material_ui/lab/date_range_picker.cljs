(ns reagent-material-ui.lab.date-range-picker
  "Imports @material-ui/lab/DateRangePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/date-range-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DateRangePicker" :as MuiDateRangePicker]))

(def date-range-picker (adapt-react-class (.-default MuiDateRangePicker) "mui-date-range-picker"))
