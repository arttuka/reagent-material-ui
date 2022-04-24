(ns reagent-mui.x.desktop-time-picker
  "Imports @mui/x-date-pickers/DesktopTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/DesktopTimePicker" :as MuiDesktopTimePicker]))

(def desktop-time-picker (adapt-react-class MuiDesktopTimePicker/DesktopTimePicker "mui-desktop-time-picker"))
