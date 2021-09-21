(ns reagent-mui.material.bottom-navigation-action
  "Imports @mui/material/BottomNavigationAction as a Reagent component.
   Original documentation is at https://mui.com/api/bottom-navigation-action/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/BottomNavigationAction" :as MuiBottomNavigationAction]))

(def bottom-navigation-action (adapt-react-class (.-default MuiBottomNavigationAction) "mui-bottom-navigation-action"))
