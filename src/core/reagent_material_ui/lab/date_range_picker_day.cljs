(ns reagent-material-ui.lab.date-range-picker-day
  "Imports @material-ui/lab/DateRangePickerDay as a Reagent component.
   Original documentation is at https://material-ui.com/api/date-range-picker-day/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DateRangePickerDay" :as MuiDateRangePickerDay]))

(def date-range-picker-day (adapt-react-class (or (.-default MuiDateRangePickerDay) (.-DateRangePickerDay MuiDateRangePickerDay)) "mui-date-range-picker-day"))
