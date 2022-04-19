(ns reagent-mui.lab.tree-item
  "Imports @mui/lab/TreeItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tree-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TreeItem" :as MuiTreeItem]))

(def tree-item (adapt-react-class (.-default MuiTreeItem) "mui-tree-item"))
