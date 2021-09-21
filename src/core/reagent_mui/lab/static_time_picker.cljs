(ns reagent-mui.lab.static-time-picker
  "Imports @mui/lab/StaticTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/static-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/StaticTimePicker" :as MuiStaticTimePicker]))

(def static-time-picker (adapt-react-class (.-default MuiStaticTimePicker) "mui-static-time-picker"))
