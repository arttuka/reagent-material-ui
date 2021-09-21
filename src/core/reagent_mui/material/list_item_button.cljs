(ns reagent-mui.material.list-item-button
  "Imports @mui/material/ListItemButton as a Reagent component.
   Original documentation is at https://mui.com/api/list-item-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListItemButton" :as MuiListItemButton]))

(def list-item-button (adapt-react-class (.-default MuiListItemButton) "mui-list-item-button"))
