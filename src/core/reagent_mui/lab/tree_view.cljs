(ns reagent-mui.lab.tree-view
  "Imports @mui/lab/TreeView as a Reagent component.
   Original documentation is at https://mui.com/api/tree-view/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TreeView" :as MuiTreeView]))

(def tree-view (adapt-react-class (.-default MuiTreeView) "mui-tree-view"))
