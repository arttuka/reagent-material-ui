(ns reagent-material-ui.core.table-body
  "Imports @material-ui/core/TableBody as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-body/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableBody" :as TableBody]))

(def table-body (adapt-react-class (or (.-default TableBody) (.-TableBody TableBody)) "mui-table-body"))
