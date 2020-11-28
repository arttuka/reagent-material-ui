(ns reagent-material-ui.lab.month-picker
  "Imports @material-ui/lab/MonthPicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/month-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/MonthPicker" :as MuiMonthPicker]))

(def month-picker (adapt-react-class (or (.-default MuiMonthPicker) (.-MonthPicker MuiMonthPicker)) "mui-month-picker"))
