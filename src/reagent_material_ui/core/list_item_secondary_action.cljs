(ns reagent-material-ui.core.list-item-secondary-action
  "Imports @material-ui/core/ListItemSecondaryAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-secondary-action/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-item-secondary-action (r/adapt-react-class (.-ListItemSecondaryAction js/MaterialUI)))
