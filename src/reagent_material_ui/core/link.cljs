(ns reagent-material-ui.core.link
  "Imports @material-ui/core/Link as a Reagent component.
   Original documentation is at https://material-ui.com/api/link/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def link (r/adapt-react-class (.-Link js/MaterialUI)))
