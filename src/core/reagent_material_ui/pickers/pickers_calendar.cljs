(ns reagent-material-ui.pickers.pickers-calendar
  "Imports @material-ui/pickers/PickersCalendar as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/PickersCalendar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def pickers-calendar (adapt-react-class (.-PickersCalendar pickers) "mui-pickers-calendar"))
