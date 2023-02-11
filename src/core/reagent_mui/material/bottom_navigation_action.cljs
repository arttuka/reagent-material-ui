(ns reagent-mui.material.bottom-navigation-action
  "Imports @mui/material/BottomNavigationAction as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/bottom-navigation-action/ ."
  (:require [reagent.core :as r]
            ["@mui/material/BottomNavigationAction" :as MuiBottomNavigationAction]))

(def bottom-navigation-action (r/adapt-react-class (.-default MuiBottomNavigationAction)))
