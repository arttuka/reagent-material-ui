(ns reagent-mui.lab.desktop-date-time-picker
  "Imports @mui/lab/DesktopDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/desktop-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DesktopDateTimePicker" :as MuiDesktopDateTimePicker]))

(def desktop-date-time-picker (adapt-react-class (.-default MuiDesktopDateTimePicker) "mui-desktop-date-time-picker"))
