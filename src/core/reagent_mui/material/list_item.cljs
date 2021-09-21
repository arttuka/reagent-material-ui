(ns reagent-mui.material.list-item
  "Imports @mui/material/ListItem as a Reagent component.
   Original documentation is at https://mui.com/api/list-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListItem" :as MuiListItem]))

(def list-item (adapt-react-class (.-default MuiListItem) "mui-list-item"))
