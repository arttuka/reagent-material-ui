(ns reagent-material-ui.core.menu-list
  "Imports @material-ui/core/MenuList as a Reagent component.
   Original documentation is at https://material-ui.com/api/menu-list/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def menu-list (r/adapt-react-class (.-MenuList js/MaterialUI)))
