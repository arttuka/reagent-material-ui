(ns reagent-material-ui.core.swipeable-drawer
  "Imports @material-ui/core/SwipeableDrawer as a Reagent component.
   Original documentation is at https://material-ui.com/api/swipeable-drawer/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def swipeable-drawer (r/adapt-react-class (.-SwipeableDrawer js/MaterialUI)))
