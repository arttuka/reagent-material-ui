(ns reagent-mui.x.desktop-date-time-picker-pro
  "Imports @mui/x-date-pickers-pro/DesktopDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-time-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DesktopDateTimePicker" :as MuiDesktopDateTimePicker]))

(def desktop-date-time-picker (r/adapt-react-class MuiDesktopDateTimePicker/DesktopDateTimePicker))
