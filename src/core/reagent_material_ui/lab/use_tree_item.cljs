(ns reagent-material-ui.lab.use-tree-item
  "Imports @material-ui/lab/TreeItem/useTreeItem as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-tree-item/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/lab/TreeItem" :as MuiTreeItem]))

(def use-tree-item (wrap-js-function (.-useTreeItem MuiTreeItem)))
