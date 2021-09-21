(ns reagent-mui.material.table-sort-label
  "Imports @mui/material/TableSortLabel as a Reagent component.
   Original documentation is at https://mui.com/api/table-sort-label/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableSortLabel" :as MuiTableSortLabel]))

(def table-sort-label (adapt-react-class (.-default MuiTableSortLabel) "mui-table-sort-label"))
