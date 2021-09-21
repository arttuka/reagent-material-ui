(ns reagent-mui.lab.year-picker
  "Imports @mui/lab/YearPicker as a Reagent component.
   Original documentation is at https://mui.com/api/year-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/YearPicker" :as MuiYearPicker]))

(def year-picker (adapt-react-class (.-default MuiYearPicker) "mui-year-picker"))
