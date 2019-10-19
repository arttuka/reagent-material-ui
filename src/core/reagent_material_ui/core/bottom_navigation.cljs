(ns reagent-material-ui.core.bottom-navigation
  "Imports @material-ui/core/BottomNavigation as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def bottom-navigation (adapt-react-class (.-BottomNavigation js/MaterialUI) "mui-bottom-navigation"))
