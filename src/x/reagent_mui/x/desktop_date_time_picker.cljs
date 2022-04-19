(ns reagent-mui.x.desktop-date-time-picker
  "Imports @mui/x-date-pickers/DesktopDateTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/DesktopDateTimePicker" :as MuiDesktopDateTimePicker]))

(def desktop-date-time-picker (adapt-react-class (.-DesktopDateTimePicker MuiDesktopDateTimePicker) "mui-desktop-date-time-picker"))
