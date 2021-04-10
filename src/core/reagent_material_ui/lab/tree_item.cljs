(ns reagent-material-ui.lab.tree-item
  "Imports @material-ui/lab/TreeItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/tree-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TreeItem" :as MuiTreeItem]))

(def tree-item (adapt-react-class (.-default MuiTreeItem) "mui-tree-item"))
