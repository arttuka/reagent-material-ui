(ns reagent-mui.material.pagination
  "Imports @mui/material/Pagination as a Reagent component.
   Original documentation is at https://mui.com/api/pagination/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Pagination" :as MuiPagination]))

(def pagination (adapt-react-class (.-default MuiPagination) "mui-pagination"))
