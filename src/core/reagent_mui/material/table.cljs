(ns reagent-mui.material.table
  "Imports @mui/material/Table as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Table" :as MuiTable]))

(def table (adapt-react-class (.-default MuiTable) "mui-table"))
