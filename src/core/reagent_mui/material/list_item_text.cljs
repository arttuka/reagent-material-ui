(ns reagent-mui.material.list-item-text
  "Imports @mui/material/ListItemText as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item-text/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItemText" :as MuiListItemText]))

(def list-item-text (r/adapt-react-class (.-default MuiListItemText)))
