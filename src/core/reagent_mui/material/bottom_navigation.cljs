(ns reagent-mui.material.bottom-navigation
  "Imports @mui/material/BottomNavigation as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/bottom-navigation/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/BottomNavigation" :as MuiBottomNavigation]))

(def bottom-navigation (adapt-react-class (.-default MuiBottomNavigation) "mui-bottom-navigation"))
