(ns reagent-mui.material.table-footer
  "Imports @mui/material/TableFooter as a Reagent component.
   Original documentation is at https://mui.com/api/table-footer/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableFooter" :as MuiTableFooter]))

(def table-footer (adapt-react-class (.-default MuiTableFooter) "mui-table-footer"))
