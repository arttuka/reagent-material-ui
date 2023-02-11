(ns reagent-mui.material.table-head
  "Imports @mui/material/TableHead as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-head/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableHead" :as MuiTableHead]))

(def table-head (r/adapt-react-class (.-default MuiTableHead)))
