(ns reagent-mui.material.table-pagination
  "Imports @mui/material/TablePagination as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-pagination/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TablePagination" :as MuiTablePagination]))

(def table-pagination (r/adapt-react-class (.-default MuiTablePagination)))
