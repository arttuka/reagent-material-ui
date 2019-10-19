(ns reagent-material-ui.core.table-row
  "Imports @material-ui/core/TableRow as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-row/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def table-row (adapt-react-class (.-TableRow js/MaterialUI) "mui-table-row"))
