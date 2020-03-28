(ns reagent-material-ui.core.swipeable-drawer
  "Imports @material-ui/core/SwipeableDrawer as a Reagent component.
   Original documentation is at https://material-ui.com/api/swipeable-drawer/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/SwipeableDrawer" :as SwipeableDrawer]))

(def swipeable-drawer (adapt-react-class (or (.-default SwipeableDrawer) (.-SwipeableDrawer SwipeableDrawer)) "mui-swipeable-drawer"))
