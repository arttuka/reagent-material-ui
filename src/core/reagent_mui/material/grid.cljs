(ns reagent-mui.material.grid
  "Imports @mui/material/Grid as a Reagent component.
   Original documentation is at https://mui.com/api/grid/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Grid" :as MuiGrid]))

(def grid (adapt-react-class (.-default MuiGrid) "mui-grid"))
