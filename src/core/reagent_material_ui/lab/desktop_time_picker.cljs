(ns reagent-material-ui.lab.desktop-time-picker
  "Imports @material-ui/lab/DesktopTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/desktop-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DesktopTimePicker" :as MuiDesktopTimePicker]))

(def desktop-time-picker (adapt-react-class (or (.-default MuiDesktopTimePicker) (.-DesktopTimePicker MuiDesktopTimePicker)) "mui-desktop-time-picker"))
