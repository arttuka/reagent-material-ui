(ns reagent-material-ui.core.table-sort-label
  "Imports @material-ui/core/TableSortLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-sort-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableSortLabel" :as MuiTableSortLabel]))

(def table-sort-label (adapt-react-class (or (.-default MuiTableSortLabel) (.-TableSortLabel MuiTableSortLabel)) "mui-table-sort-label"))
