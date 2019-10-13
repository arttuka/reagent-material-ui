(ns reagent-material-ui.core.list-item
  "Imports @material-ui/core/ListItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-item (r/adapt-react-class (.-ListItem js/MaterialUI)))
