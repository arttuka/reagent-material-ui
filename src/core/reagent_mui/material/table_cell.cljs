(ns reagent-mui.material.table-cell
  "Imports @mui/material/TableCell as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-cell/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableCell" :as MuiTableCell]))

(def table-cell (r/adapt-react-class (.-default MuiTableCell)))
