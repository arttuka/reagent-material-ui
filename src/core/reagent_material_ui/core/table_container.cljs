(ns reagent-material-ui.core.table-container
  "Imports @material-ui/core/TableContainer as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-container/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def table-container (adapt-react-class (.-TableContainer js/MaterialUI) "mui-table-container"))
