(ns reagent-material-ui.lab.desktop-date-time-picker
  "Imports @material-ui/lab/DesktopDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/desktop-date-time-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DesktopDateTimePicker" :as MuiDesktopDateTimePicker]))

(def desktop-date-time-picker (adapt-react-class (.-default MuiDesktopDateTimePicker) "mui-desktop-date-time-picker"))
