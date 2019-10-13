(ns reagent-material-ui.core.table-body
  "Imports @material-ui/core/TableBody as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-body/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-body (r/adapt-react-class (.-TableBody js/MaterialUI)))
