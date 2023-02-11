(ns reagent-mui.lab.tree-view
  "Imports @mui/lab/TreeView as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tree-view/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TreeView" :as MuiTreeView]))

(def tree-view (r/adapt-react-class (.-default MuiTreeView)))
