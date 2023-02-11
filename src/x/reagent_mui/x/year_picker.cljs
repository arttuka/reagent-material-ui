(ns reagent-mui.x.year-picker
  "Imports @mui/x-date-pickers/YearPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/year-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/YearPicker" :as MuiYearPicker]))

(def year-picker (r/adapt-react-class MuiYearPicker/YearPicker))
