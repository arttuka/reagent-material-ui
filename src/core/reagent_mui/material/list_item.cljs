(ns reagent-mui.material.list-item
  "Imports @mui/material/ListItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-item/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListItem" :as MuiListItem]))

(def list-item (r/adapt-react-class (.-default MuiListItem)))
