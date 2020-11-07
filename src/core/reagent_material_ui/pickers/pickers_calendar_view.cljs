(ns reagent-material-ui.pickers.pickers-calendar-view
  "Imports @material-ui/pickers/PickersCalendarView as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersCalendarView/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-calendar-view (adapt-react-class (.-PickersCalendarView pickers) "mui-pickers-calendar-view"))
