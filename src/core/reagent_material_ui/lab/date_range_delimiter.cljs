(ns reagent-material-ui.lab.date-range-delimiter
  "Imports @material-ui/lab/DateRangeDelimiter as a Reagent component.
   Original documentation is at https://material-ui.com/api/date-range-delimiter/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DateRangeDelimiter" :as MuiDateRangeDelimiter]))

(def date-range-delimiter (adapt-react-class (or (.-default MuiDateRangeDelimiter) (.-DateRangeDelimiter MuiDateRangeDelimiter)) "mui-date-range-delimiter"))
