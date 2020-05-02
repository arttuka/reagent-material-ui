(ns reagent-material-ui.core.table-footer
  "Imports @material-ui/core/TableFooter as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-footer/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TableFooter" :as MuiTableFooter]))

(def table-footer (adapt-react-class (or (.-default MuiTableFooter) (.-TableFooter MuiTableFooter)) "mui-table-footer"))
