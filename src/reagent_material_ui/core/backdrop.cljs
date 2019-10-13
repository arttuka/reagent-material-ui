(ns reagent-material-ui.core.backdrop
  "Imports @material-ui/core/Backdrop as a Reagent component.
   Original documentation is at https://material-ui.com/api/backdrop/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def backdrop (r/adapt-react-class (.-Backdrop js/MaterialUI)))
