(ns reagent-material-ui.pickers.desktop-date-range-picker
  "Imports @material-ui/pickers/DesktopDateRangePicker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DesktopDateRangePicker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def desktop-date-range-picker (adapt-react-class (.-DesktopDateRangePicker pickers) "mui-desktop-date-range-picker"))
