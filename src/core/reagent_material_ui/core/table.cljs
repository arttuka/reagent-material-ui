(ns reagent-material-ui.core.table
  "Imports @material-ui/core/Table as a Reagent component.
   Original documentation is at https://material-ui.com/api/table/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Table" :as MuiTable]))

(def table (adapt-react-class (.-default MuiTable) "mui-table"))
