(ns reagent-mui.material.table-container
  "Imports @mui/material/TableContainer as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-container/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableContainer" :as MuiTableContainer]))

(def table-container (r/adapt-react-class (.-default MuiTableContainer)))
