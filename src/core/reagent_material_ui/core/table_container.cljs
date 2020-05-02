(ns reagent-material-ui.core.table-container
  "Imports @material-ui/core/TableContainer as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-container/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableContainer" :as MuiTableContainer]))

(def table-container (adapt-react-class (or (.-default MuiTableContainer) (.-TableContainer MuiTableContainer)) "mui-table-container"))
