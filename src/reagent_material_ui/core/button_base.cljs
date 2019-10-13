(ns reagent-material-ui.core.button-base
  "Imports @material-ui/core/ButtonBase as a Reagent component.
   Original documentation is at https://material-ui.com/api/button-base/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def button-base (r/adapt-react-class (.-ButtonBase js/MaterialUI)))
