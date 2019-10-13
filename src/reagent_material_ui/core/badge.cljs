(ns reagent-material-ui.core.badge
  "Imports @material-ui/core/Badge as a Reagent component.
   Original documentation is at https://material-ui.com/api/badge/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def badge (r/adapt-react-class (.-Badge js/MaterialUI)))
