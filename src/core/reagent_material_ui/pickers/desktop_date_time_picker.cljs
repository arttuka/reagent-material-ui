(ns reagent-material-ui.pickers.desktop-date-time-picker
  "Imports @material-ui/pickers/DesktopDateTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DesktopDateTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def desktop-date-time-picker (adapt-react-class (.-DesktopDateTimePicker pickers) "mui-desktop-date-time-picker"))
