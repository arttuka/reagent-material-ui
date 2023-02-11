(ns reagent-mui.material.bottom-navigation
  "Imports @mui/material/BottomNavigation as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/bottom-navigation/ ."
  (:require [reagent.core :as r]
            ["@mui/material/BottomNavigation" :as MuiBottomNavigation]))

(def bottom-navigation (r/adapt-react-class (.-default MuiBottomNavigation)))
