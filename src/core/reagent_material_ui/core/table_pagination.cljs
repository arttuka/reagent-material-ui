(ns reagent-material-ui.core.table-pagination
  "Imports @material-ui/core/TablePagination as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-pagination/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TablePagination" :as TablePagination]))

(def table-pagination (adapt-react-class (or (.-default TablePagination) (.-TablePagination TablePagination)) "mui-table-pagination"))
