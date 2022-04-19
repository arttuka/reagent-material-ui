(ns reagent-mui.x.year-picker-pro
  "Imports @mui/x-date-pickers-pro/YearPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/year-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/YearPicker" :as MuiYearPicker]))

(def year-picker (adapt-react-class (.-YearPicker MuiYearPicker) "mui-year-picker"))
