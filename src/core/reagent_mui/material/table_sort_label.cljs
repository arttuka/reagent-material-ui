(ns reagent-mui.material.table-sort-label
  "Imports @mui/material/TableSortLabel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-sort-label/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableSortLabel" :as MuiTableSortLabel]))

(def table-sort-label (r/adapt-react-class (.-default MuiTableSortLabel)))
