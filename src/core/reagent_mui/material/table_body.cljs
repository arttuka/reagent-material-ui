(ns reagent-mui.material.table-body
  "Imports @mui/material/TableBody as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-body/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableBody" :as MuiTableBody]))

(def table-body (r/adapt-react-class (.-default MuiTableBody)))
