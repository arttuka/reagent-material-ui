(ns reagent-mui.material.grid
  "Imports @mui/material/Grid as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/grid/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Grid" :as MuiGrid]))

(def grid (r/adapt-react-class (.-default MuiGrid)))
