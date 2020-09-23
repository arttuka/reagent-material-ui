(ns reagent-material-ui.pickers.desktop-time-picker
  "Imports @material-ui/pickers/DesktopTimePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DesktopTimePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def desktop-time-picker (adapt-react-class (.-DesktopTimePicker pickers) "mui-desktop-time-picker"))
