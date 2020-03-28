(ns reagent-material-ui.core.table-head
  "Imports @material-ui/core/TableHead as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-head/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableHead" :as TableHead]))

(def table-head (adapt-react-class (or (.-default TableHead) (.-TableHead TableHead)) "mui-table-head"))
