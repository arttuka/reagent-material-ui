(ns reagent-material-ui.core.menu-item
  "Imports @material-ui/core/MenuItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/menu-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/MenuItem" :as MuiMenuItem]))

(def menu-item (adapt-react-class (or (.-default MuiMenuItem) (.-MenuItem MuiMenuItem)) "mui-menu-item"))
