(ns reagent-mui.x.desktop-date-picker
  "Imports @mui/x-date-pickers/DesktopDatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/DesktopDatePicker" :as MuiDesktopDatePicker]))

(def desktop-date-picker (adapt-react-class MuiDesktopDatePicker/DesktopDatePicker "mui-desktop-date-picker"))
