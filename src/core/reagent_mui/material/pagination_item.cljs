(ns reagent-mui.material.pagination-item
  "Imports @mui/material/PaginationItem as a Reagent component.
   Original documentation is at https://mui.com/api/pagination-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/PaginationItem" :as MuiPaginationItem]))

(def pagination-item (adapt-react-class (.-default MuiPaginationItem) "mui-pagination-item"))
