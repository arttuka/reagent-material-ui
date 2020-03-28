(ns reagent-material-ui.core.bottom-navigation-action
  "Imports @material-ui/core/BottomNavigationAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/BottomNavigationAction" :as BottomNavigationAction]))

(def bottom-navigation-action (adapt-react-class (or (.-default BottomNavigationAction) (.-BottomNavigationAction BottomNavigationAction)) "mui-bottom-navigation-action"))
