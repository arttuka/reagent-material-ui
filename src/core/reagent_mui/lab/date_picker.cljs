(ns reagent-mui.lab.date-picker
  "Imports @mui/lab/DatePicker as a Reagent component.
   Original documentation is at https://mui.com/api/date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DatePicker" :as MuiDatePicker]))

(def date-picker (adapt-react-class (.-default MuiDatePicker) "mui-date-picker"))
