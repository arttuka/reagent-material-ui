(ns reagent-mui.material.table-head
  "Imports @mui/material/TableHead as a Reagent component.
   Original documentation is at https://mui.com/api/table-head/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableHead" :as MuiTableHead]))

(def table-head (adapt-react-class (.-default MuiTableHead) "mui-table-head"))
