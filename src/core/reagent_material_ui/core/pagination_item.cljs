(ns reagent-material-ui.core.pagination-item
  "Imports @material-ui/core/PaginationItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/pagination-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/PaginationItem" :as MuiPaginationItem]))

(def pagination-item (adapt-react-class (.-default MuiPaginationItem) "mui-pagination-item"))
