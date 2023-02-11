(ns reagent-mui.material.list-item-secondary-action
  "Imports @mui/material/ListItemSecondaryAction as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item-secondary-action/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItemSecondaryAction" :as MuiListItemSecondaryAction]))

(def list-item-secondary-action (r/adapt-react-class (.-default MuiListItemSecondaryAction)))
