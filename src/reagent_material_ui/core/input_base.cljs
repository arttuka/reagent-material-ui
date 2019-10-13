(ns reagent-material-ui.core.input-base
  "Imports @material-ui/core/InputBase as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-base/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def input-base (r/adapt-react-class (.-InputBase js/MaterialUI)))
