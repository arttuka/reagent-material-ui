(ns reagent-material-ui.core.bottom-navigation-action
  "Imports @material-ui/core/BottomNavigationAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation-action/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def bottom-navigation-action (r/adapt-react-class (.-BottomNavigationAction js/MaterialUI)))
