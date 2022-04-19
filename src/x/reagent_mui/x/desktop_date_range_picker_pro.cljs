(ns reagent-mui.x.desktop-date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/DesktopDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-range-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/DesktopDateRangePicker" :as MuiDesktopDateRangePicker]))

(def desktop-date-range-picker (adapt-react-class (.-DesktopDateRangePicker MuiDesktopDateRangePicker) "mui-desktop-date-range-picker"))
