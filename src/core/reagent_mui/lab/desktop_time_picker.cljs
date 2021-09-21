(ns reagent-mui.lab.desktop-time-picker
  "Imports @mui/lab/DesktopTimePicker as a Reagent component.
   Original documentation is at https://mui.com/api/desktop-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DesktopTimePicker" :as MuiDesktopTimePicker]))

(def desktop-time-picker (adapt-react-class (.-default MuiDesktopTimePicker) "mui-desktop-time-picker"))
