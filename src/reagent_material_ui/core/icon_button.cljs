(ns reagent-material-ui.core.icon-button
  "Imports @material-ui/core/IconButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/icon-button/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def icon-button (r/adapt-react-class (.-IconButton js/MaterialUI)))
