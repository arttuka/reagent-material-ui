(ns reagent-mui.base.table-pagination-unstyled
  "Imports @mui/base/TablePaginationUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/table-pagination-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TablePaginationUnstyled" :as MuiTablePaginationUnstyled]))

(def table-pagination-unstyled (adapt-react-class (.-default MuiTablePaginationUnstyled) "mui-table-pagination-unstyled"))
