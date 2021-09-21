(ns reagent-mui.material.list-item-secondary-action
  "Imports @mui/material/ListItemSecondaryAction as a Reagent component.
   Original documentation is at https://mui.com/api/list-item-secondary-action/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListItemSecondaryAction" :as MuiListItemSecondaryAction]))

(def list-item-secondary-action (adapt-react-class (.-default MuiListItemSecondaryAction) "mui-list-item-secondary-action"))
