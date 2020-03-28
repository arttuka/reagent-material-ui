(ns reagent-material-ui.pickers.calendar
  "Imports @material-ui/pickers/Calendar as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/Calendar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def calendar (adapt-react-class (.-Calendar pickers) "mui-calendar"))
