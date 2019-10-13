(ns reagent-material-ui.core.table-head
  "Imports @material-ui/core/TableHead as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-head/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-head (r/adapt-react-class (.-TableHead js/MaterialUI)))
