(ns reagent-material-ui.core.grid-list-tile-bar
  "Imports @material-ui/core/GridListTileBar as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list-tile-bar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/GridListTileBar" :as GridListTileBar]))

(def grid-list-tile-bar (adapt-react-class (or (.-default GridListTileBar) (.-GridListTileBar GridListTileBar)) "mui-grid-list-tile-bar"))
