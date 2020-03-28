(ns reagent-material-ui.lab.pagination-item
  "Imports @material-ui/lab/PaginationItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/pagination-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/PaginationItem" :as PaginationItem]))

(def pagination-item (adapt-react-class (or (.-default PaginationItem) (.-PaginationItem PaginationItem)) "mui-pagination-item"))
