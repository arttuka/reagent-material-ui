(ns reagent-mui.material.table
  "Imports @mui/material/Table as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Table" :as MuiTable]))

(def table (r/adapt-react-class (.-default MuiTable)))
