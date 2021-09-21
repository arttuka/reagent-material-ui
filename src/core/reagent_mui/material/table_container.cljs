(ns reagent-mui.material.table-container
  "Imports @mui/material/TableContainer as a Reagent component.
   Original documentation is at https://mui.com/api/table-container/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableContainer" :as MuiTableContainer]))

(def table-container (adapt-react-class (.-default MuiTableContainer) "mui-table-container"))
