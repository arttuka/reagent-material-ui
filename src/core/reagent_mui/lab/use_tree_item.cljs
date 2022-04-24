(ns reagent-mui.lab.use-tree-item
  "Imports @mui/lab/TreeItem/useTreeItem as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/material-ui/api/use-tree-item/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/lab/TreeItem" :as MuiTreeItem]))

(def use-tree-item (wrap-js-function MuiTreeItem/useTreeItem))
