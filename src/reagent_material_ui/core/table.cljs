(ns reagent-material-ui.core.table
  "Imports @material-ui/core/Table as a Reagent component.
   Original documentation is at https://material-ui.com/api/table/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def table (r/adapt-react-class (.-Table js/MaterialUI)))
