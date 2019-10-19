(ns reagent-material-ui.core.list-item-text
  "Imports @material-ui/core/ListItemText as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-text/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def list-item-text (adapt-react-class (.-ListItemText js/MaterialUI) "mui-list-item-text"))
