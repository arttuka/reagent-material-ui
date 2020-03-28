(ns reagent-material-ui.lab.tree-view
  "Imports @material-ui/lab/TreeView as a Reagent component.
   Original documentation is at https://material-ui.com/api/tree-view/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TreeView" :as TreeView]))

(def tree-view (adapt-react-class (or (.-default TreeView) (.-TreeView TreeView)) "mui-tree-view"))
