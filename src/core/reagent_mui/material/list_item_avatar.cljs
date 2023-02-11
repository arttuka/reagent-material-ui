(ns reagent-mui.material.list-item-avatar
  "Imports @mui/material/ListItemAvatar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item-avatar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItemAvatar" :as MuiListItemAvatar]))

(def list-item-avatar (r/adapt-react-class (.-default MuiListItemAvatar)))
