(ns reagent-material-ui.lab.desktop-date-picker
  "Imports @material-ui/lab/DesktopDatePicker as a Reagent component.
   Original documentation is at https://material-ui.com/api/desktop-date-picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/DesktopDatePicker" :as MuiDesktopDatePicker]))

(def desktop-date-picker (adapt-react-class (.-default MuiDesktopDatePicker) "mui-desktop-date-picker"))
