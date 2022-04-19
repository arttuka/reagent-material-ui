(ns reagent-mui.material.table-pagination
  "Imports @mui/material/TablePagination as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-pagination/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TablePagination" :as MuiTablePagination]))

(def table-pagination (adapt-react-class (.-default MuiTablePagination) "mui-table-pagination"))
