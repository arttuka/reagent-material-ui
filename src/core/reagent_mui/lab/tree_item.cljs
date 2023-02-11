(ns reagent-mui.lab.tree-item
  "Imports @mui/lab/TreeItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tree-item/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TreeItem" :as MuiTreeItem]))

(def tree-item (r/adapt-react-class (.-default MuiTreeItem)))
