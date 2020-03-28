(ns reagent-material-ui.core.table-cell
  "Imports @material-ui/core/TableCell as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-cell/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableCell" :as TableCell]))

(def table-cell (adapt-react-class (or (.-default TableCell) (.-TableCell TableCell)) "mui-table-cell"))
