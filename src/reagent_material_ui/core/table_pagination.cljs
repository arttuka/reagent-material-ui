(ns reagent-material-ui.core.table-pagination
  "Imports @material-ui/core/TablePagination as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-pagination/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-pagination (r/adapt-react-class (.-TablePagination js/MaterialUI)))
