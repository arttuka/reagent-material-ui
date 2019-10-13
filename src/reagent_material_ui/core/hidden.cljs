(ns reagent-material-ui.core.hidden
  "Imports @material-ui/core/Hidden as a Reagent component.
   Original documentation is at https://material-ui.com/api/hidden/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def hidden (r/adapt-react-class (.-Hidden js/MaterialUI)))
