(ns reagent-material-ui.core.table-cell
  "Imports @material-ui/core/TableCell as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-cell/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-cell (r/adapt-react-class (.-TableCell js/MaterialUI)))
