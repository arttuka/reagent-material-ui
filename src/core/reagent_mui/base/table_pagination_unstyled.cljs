(ns reagent-mui.base.table-pagination-unstyled
  "Imports @mui/base/TablePaginationUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/table-pagination-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/TablePaginationUnstyled" :as MuiTablePaginationUnstyled]))

(def table-pagination-unstyled (r/adapt-react-class (.-default MuiTablePaginationUnstyled)))
