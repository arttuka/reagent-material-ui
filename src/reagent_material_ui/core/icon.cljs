(ns reagent-material-ui.core.icon
  "Imports @material-ui/core/Icon as a Reagent component.
   Original documentation is at https://material-ui.com/api/icon/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def icon (r/adapt-react-class (.-Icon js/MaterialUI)))
