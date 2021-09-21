(ns reagent-mui.material.list-item-icon
  "Imports @mui/material/ListItemIcon as a Reagent component.
   Original documentation is at https://mui.com/api/list-item-icon/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListItemIcon" :as MuiListItemIcon]))

(def list-item-icon (adapt-react-class (.-default MuiListItemIcon) "mui-list-item-icon"))
