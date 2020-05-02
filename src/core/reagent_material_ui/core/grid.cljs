(ns reagent-material-ui.core.grid
  "Imports @material-ui/core/Grid as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Grid" :as MuiGrid]))

(def grid (adapt-react-class (or (.-default MuiGrid) (.-Grid MuiGrid)) "mui-grid"))
