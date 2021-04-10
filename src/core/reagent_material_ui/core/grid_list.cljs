(ns reagent-material-ui.core.grid-list
  "Imports @material-ui/core/GridList as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/GridList" :as MuiGridList]))

(def grid-list (adapt-react-class (.-default MuiGridList) "mui-grid-list"))
