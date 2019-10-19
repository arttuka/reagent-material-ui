(ns reagent-material-ui.core.bottom-navigation-action
  "Imports @material-ui/core/BottomNavigationAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def bottom-navigation-action (adapt-react-class (.-BottomNavigationAction js/MaterialUI) "mui-bottom-navigation-action"))
