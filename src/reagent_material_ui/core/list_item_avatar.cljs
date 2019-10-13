(ns reagent-material-ui.core.list-item-avatar
  "Imports @material-ui/core/ListItemAvatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-avatar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-item-avatar (r/adapt-react-class (.-ListItemAvatar js/MaterialUI)))
