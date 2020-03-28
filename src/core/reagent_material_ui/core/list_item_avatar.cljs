(ns reagent-material-ui.core.list-item-avatar
  "Imports @material-ui/core/ListItemAvatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-avatar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemAvatar" :as ListItemAvatar]))

(def list-item-avatar (adapt-react-class (or (.-default ListItemAvatar) (.-ListItemAvatar ListItemAvatar)) "mui-list-item-avatar"))
