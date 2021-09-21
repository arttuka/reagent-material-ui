(ns reagent-mui.material.table-body
  "Imports @mui/material/TableBody as a Reagent component.
   Original documentation is at https://mui.com/api/table-body/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableBody" :as MuiTableBody]))

(def table-body (adapt-react-class (.-default MuiTableBody) "mui-table-body"))
