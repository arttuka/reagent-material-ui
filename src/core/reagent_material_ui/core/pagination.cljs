(ns reagent-material-ui.core.pagination
  "Imports @material-ui/core/Pagination as a Reagent component.
   Original documentation is at https://material-ui.com/api/pagination/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Pagination" :as MuiPagination]))

(def pagination (adapt-react-class (or (.-default MuiPagination) (.-Pagination MuiPagination)) "mui-pagination"))
