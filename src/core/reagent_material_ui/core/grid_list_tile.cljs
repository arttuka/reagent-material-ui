(ns reagent-material-ui.core.grid-list-tile
  "Imports @material-ui/core/GridListTile as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list-tile/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def grid-list-tile (adapt-react-class (.-GridListTile js/MaterialUI) "mui-grid-list-tile"))
