(ns reagent-material-ui.core.list-item-icon
  "Imports @material-ui/core/ListItemIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-icon/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-item-icon (r/adapt-react-class (.-ListItemIcon js/MaterialUI)))
