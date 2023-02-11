(ns reagent-mui.material.pagination
  "Imports @mui/material/Pagination as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/pagination/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Pagination" :as MuiPagination]))

(def pagination (r/adapt-react-class (.-default MuiPagination)))
