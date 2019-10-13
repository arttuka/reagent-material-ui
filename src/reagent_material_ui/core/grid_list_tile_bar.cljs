(ns reagent-material-ui.core.grid-list-tile-bar
  "Imports @material-ui/core/GridListTileBar as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list-tile-bar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def grid-list-tile-bar (r/adapt-react-class (.-GridListTileBar js/MaterialUI)))
