(ns reagent-material-ui.core.table-footer
  "Imports @material-ui/core/TableFooter as a Reagent component.
   Original documentation is at https://material-ui.com/api/table-footer/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table-footer (r/adapt-react-class (.-TableFooter js/MaterialUI)))
