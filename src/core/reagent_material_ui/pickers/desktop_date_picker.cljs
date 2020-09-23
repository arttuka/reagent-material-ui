(ns reagent-material-ui.pickers.desktop-date-picker
  "Imports @material-ui/pickers/DesktopDatePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DesktopDatePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def desktop-date-picker (adapt-react-class (.-DesktopDatePicker pickers) "mui-desktop-date-picker"))
