(ns reagent-material-ui.lab.year-picker
  "Imports @material-ui/lab/YearPicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/year-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/YearPicker" :as MuiYearPicker]))

(def year-picker (adapt-react-class (or (.-default MuiYearPicker) (.-YearPicker MuiYearPicker)) "mui-year-picker"))
