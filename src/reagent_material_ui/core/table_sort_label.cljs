(ns reagent-material-ui.core.table-sort-label
  "Imports @material-ui/core/TableSortLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-sort-label/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-sort-label (r/adapt-react-class (.-TableSortLabel js/MaterialUI)))
