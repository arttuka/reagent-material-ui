(ns reagent-material-ui.core.table-body
  "Imports @material-ui/core/TableBody as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-body/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def table-body (adapt-react-class (.-TableBody js/MaterialUI) "mui-table-body"))
