(ns reagent-material-ui.core.app-bar
  "Imports @material-ui/core/AppBar as a Reagent component.
   Original documentation is at https://material-ui.com/api/app-bar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def app-bar (r/adapt-react-class (.-AppBar js/MaterialUI)))
