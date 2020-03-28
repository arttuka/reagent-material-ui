(ns reagent-material-ui.core.list-item-text
  "Imports @material-ui/core/ListItemText as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-text/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemText" :as ListItemText]))

(def list-item-text (adapt-react-class (or (.-default ListItemText) (.-ListItemText ListItemText)) "mui-list-item-text"))
