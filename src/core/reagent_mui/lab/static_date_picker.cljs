(ns reagent-mui.lab.static-date-picker
  "Imports @mui/lab/StaticDatePicker as a Reagent component.
   Original documentation is at https://mui.com/api/static-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/StaticDatePicker" :as MuiStaticDatePicker]))

(def static-date-picker (adapt-react-class (.-default MuiStaticDatePicker) "mui-static-date-picker"))
