(ns reagent-mui.x.desktop-date-range-picker-pro
  "Imports @mui/x-date-pickers-pro/DesktopDateRangePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-range-picker/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/DesktopDateRangePicker" :as MuiDesktopDateRangePicker]))

(def desktop-date-range-picker (r/adapt-react-class MuiDesktopDateRangePicker/DesktopDateRangePicker))
