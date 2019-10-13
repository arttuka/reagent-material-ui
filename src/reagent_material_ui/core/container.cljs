(ns reagent-material-ui.core.container
  "Imports @material-ui/core/Container as a Reagent component.
   Original documentation is at https://material-ui.com/api/container/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def container (r/adapt-react-class (.-Container js/MaterialUI)))
