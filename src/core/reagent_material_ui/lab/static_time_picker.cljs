(ns reagent-material-ui.lab.static-time-picker
  "Imports @material-ui/lab/StaticTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/static-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/StaticTimePicker" :as MuiStaticTimePicker]))

(def static-time-picker (adapt-react-class (or (.-default MuiStaticTimePicker) (.-StaticTimePicker MuiStaticTimePicker)) "mui-static-time-picker"))
