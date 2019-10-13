(ns reagent-material-ui.core.button-group
  "Imports @material-ui/core/ButtonGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/button-group/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def button-group (r/adapt-react-class (.-ButtonGroup js/MaterialUI)))
