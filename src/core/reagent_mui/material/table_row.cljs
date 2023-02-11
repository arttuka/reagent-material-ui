(ns reagent-mui.material.table-row
  "Imports @mui/material/TableRow as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-row/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableRow" :as MuiTableRow]))

(def table-row (r/adapt-react-class (.-default MuiTableRow)))
