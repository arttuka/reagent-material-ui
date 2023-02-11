(ns reagent-mui.material.pagination-item
  "Imports @mui/material/PaginationItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/pagination-item/ ."
  (:require [reagent.core :as r]
            ["@mui/material/PaginationItem" :as MuiPaginationItem]))

(def pagination-item (r/adapt-react-class (.-default MuiPaginationItem)))
