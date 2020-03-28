(ns reagent-material-ui.core.list-item-secondary-action
  "Imports @material-ui/core/ListItemSecondaryAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-secondary-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemSecondaryAction" :as ListItemSecondaryAction]))

(def list-item-secondary-action (adapt-react-class (or (.-default ListItemSecondaryAction) (.-ListItemSecondaryAction ListItemSecondaryAction)) "mui-list-item-secondary-action"))
