(ns reagent-material-ui.core.paper
  "Imports @material-ui/core/Paper as a Reagent component.
   Original documentation is at https://material-ui.com/api/paper/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def paper (r/adapt-react-class (.-Paper js/MaterialUI)))
