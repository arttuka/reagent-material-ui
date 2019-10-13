(ns reagent-material-ui.core.table-row
  "Imports @material-ui/core/TableRow as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-row/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-row (r/adapt-react-class (.-TableRow js/MaterialUI)))
