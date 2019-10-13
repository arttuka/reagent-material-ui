(ns reagent-material-ui.core.list-item-text
  "Imports @material-ui/core/ListItemText as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-text/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-item-text (r/adapt-react-class (.-ListItemText js/MaterialUI)))
