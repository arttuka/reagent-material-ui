(ns reagent-mui.material.swipeable-drawer
  "Imports @mui/material/SwipeableDrawer as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/swipeable-drawer/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SwipeableDrawer" :as MuiSwipeableDrawer]))

(def swipeable-drawer (r/adapt-react-class (.-default MuiSwipeableDrawer)))
