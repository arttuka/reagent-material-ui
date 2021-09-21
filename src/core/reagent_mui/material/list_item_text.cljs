(ns reagent-mui.material.list-item-text
  "Imports @mui/material/ListItemText as a Reagent component.
   Original documentation is at https://mui.com/api/list-item-text/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListItemText" :as MuiListItemText]))

(def list-item-text (adapt-react-class (.-default MuiListItemText) "mui-list-item-text"))
