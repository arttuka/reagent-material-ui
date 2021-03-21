(ns reagent-material-ui.core.list-item-avatar
  "Imports @material-ui/core/ListItemAvatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-avatar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemAvatar" :as MuiListItemAvatar]))

(def list-item-avatar (adapt-react-class (.-default MuiListItemAvatar) "mui-list-item-avatar"))
