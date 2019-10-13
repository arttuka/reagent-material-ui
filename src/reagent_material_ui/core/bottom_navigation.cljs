(ns reagent-material-ui.core.bottom-navigation
  "Imports @material-ui/core/BottomNavigation as a Reagent component.
   Original documentation is at https://material-ui.com/api/bottom-navigation/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def bottom-navigation (r/adapt-react-class (.-BottomNavigation js/MaterialUI)))
