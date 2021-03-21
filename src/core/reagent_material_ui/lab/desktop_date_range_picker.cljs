(ns reagent-material-ui.lab.desktop-date-range-picker
  "Imports @material-ui/lab/DesktopDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/desktop-date-range-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DesktopDateRangePicker" :as MuiDesktopDateRangePicker]))

(def desktop-date-range-picker (adapt-react-class (.-default MuiDesktopDateRangePicker) "mui-desktop-date-range-picker"))
