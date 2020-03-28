(ns reagent-material-ui.core.list-item-icon
  "Imports @material-ui/core/ListItemIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemIcon" :as ListItemIcon]))

(def list-item-icon (adapt-react-class (or (.-default ListItemIcon) (.-ListItemIcon ListItemIcon)) "mui-list-item-icon"))
