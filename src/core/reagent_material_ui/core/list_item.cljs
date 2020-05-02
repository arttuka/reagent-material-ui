(ns reagent-material-ui.core.list-item
  "Imports @material-ui/core/ListItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItem" :as MuiListItem]))

(def list-item (adapt-react-class (or (.-default MuiListItem) (.-ListItem MuiListItem)) "mui-list-item"))
