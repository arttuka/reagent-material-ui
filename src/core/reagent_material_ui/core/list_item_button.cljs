(ns reagent-material-ui.core.list-item-button
  "Imports @material-ui/core/ListItemButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemButton" :as MuiListItemButton]))

(def list-item-button (adapt-react-class (.-default MuiListItemButton) "mui-list-item-button"))
