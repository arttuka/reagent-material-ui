(ns reagent-mui.lab.desktop-date-picker
  "Imports @mui/lab/DesktopDatePicker as a Reagent component.
   Original documentation is at https://mui.com/api/desktop-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DesktopDatePicker" :as MuiDesktopDatePicker]))

(def desktop-date-picker (adapt-react-class (.-default MuiDesktopDatePicker) "mui-desktop-date-picker"))
