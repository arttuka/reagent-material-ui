(ns reagent-material-ui.core.grow
  "Imports @material-ui/core/Grow as a Reagent component.
   Original documentation is at https://material-ui.com/api/grow/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def grow (r/adapt-react-class (.-Grow js/MaterialUI)))
