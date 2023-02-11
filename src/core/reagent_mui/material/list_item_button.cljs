(ns reagent-mui.material.list-item-button
  "Imports @mui/material/ListItemButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item-button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItemButton" :as MuiListItemButton]))

(def list-item-button (r/adapt-react-class (.-default MuiListItemButton)))
