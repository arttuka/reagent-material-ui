(ns reagent-material-ui.core.bottom-navigation-action
  "Imports @material-ui/core/BottomNavigationAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/BottomNavigationAction" :as MuiBottomNavigationAction]))

(def bottom-navigation-action (adapt-react-class (.-default MuiBottomNavigationAction) "mui-bottom-navigation-action"))
