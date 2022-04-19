(ns reagent-mui.material.swipeable-drawer
  "Imports @mui/material/SwipeableDrawer as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/swipeable-drawer/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SwipeableDrawer" :as MuiSwipeableDrawer]))

(def swipeable-drawer (adapt-react-class (.-default MuiSwipeableDrawer) "mui-swipeable-drawer"))
