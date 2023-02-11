(ns reagent-mui.material.list-item-icon
  "Imports @mui/material/ListItemIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item-icon/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItemIcon" :as MuiListItemIcon]))

(def list-item-icon (r/adapt-react-class (.-default MuiListItemIcon)))
