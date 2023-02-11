(ns reagent-mui.material.table-footer
  "Imports @mui/material/TableFooter as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-footer/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TableFooter" :as MuiTableFooter]))

(def table-footer (r/adapt-react-class (.-default MuiTableFooter)))
