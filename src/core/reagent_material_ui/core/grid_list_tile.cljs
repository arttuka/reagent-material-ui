(ns reagent-material-ui.core.grid-list-tile
  "Imports @material-ui/core/GridListTile as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list-tile/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/GridListTile" :as GridListTile]))

(def grid-list-tile (adapt-react-class (or (.-default GridListTile) (.-GridListTile GridListTile)) "mui-grid-list-tile"))
