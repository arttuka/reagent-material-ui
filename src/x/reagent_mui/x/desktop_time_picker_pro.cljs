(ns reagent-mui.x.desktop-time-picker-pro
  "Imports @mui/x-date-pickers-pro/DesktopTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/DesktopTimePicker" :as MuiDesktopTimePicker]))

(def desktop-time-picker (adapt-react-class (.-DesktopTimePicker MuiDesktopTimePicker) "mui-desktop-time-picker"))
