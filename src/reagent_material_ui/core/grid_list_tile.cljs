(ns reagent-material-ui.core.grid-list-tile
  "Imports @material-ui/core/GridListTile as a Reagent component.
   Original documentation is at https://material-ui.com/api/grid-list-tile/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def grid-list-tile (r/adapt-react-class (.-GridListTile js/MaterialUI)))
