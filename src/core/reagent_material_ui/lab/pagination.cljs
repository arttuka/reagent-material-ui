(ns reagent-material-ui.lab.pagination
  "Imports @material-ui/lab/Pagination as a Reagent component.
   Original documentation is at https://material-ui.com/api/pagination/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Pagination" :as Pagination]))

(def pagination (adapt-react-class (or (.-default Pagination) (.-Pagination Pagination)) "mui-pagination"))
