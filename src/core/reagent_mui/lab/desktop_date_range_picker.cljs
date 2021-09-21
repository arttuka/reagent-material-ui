(ns reagent-mui.lab.desktop-date-range-picker
  "Imports @mui/lab/DesktopDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/api/desktop-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/DesktopDateRangePicker" :as MuiDesktopDateRangePicker]))

(def desktop-date-range-picker (adapt-react-class (.-default MuiDesktopDateRangePicker) "mui-desktop-date-range-picker"))
