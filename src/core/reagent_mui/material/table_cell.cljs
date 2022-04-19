(ns reagent-mui.material.table-cell
  "Imports @mui/material/TableCell as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-cell/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableCell" :as MuiTableCell]))

(def table-cell (adapt-react-class (.-default MuiTableCell) "mui-table-cell"))
