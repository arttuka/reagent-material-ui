(ns reagent-material-ui.core.button
  "Imports @material-ui/core/Button as a Reagent component.
   Original documentation is at https://material-ui.com/api/button/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def button (r/adapt-react-class (.-Button js/MaterialUI)))
