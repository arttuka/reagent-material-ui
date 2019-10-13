(ns reagent-material-ui.core.tooltip
  "Imports @material-ui/core/Tooltip as a Reagent component.
   Original documentation is at https://material-ui.com/api/tooltip/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def tooltip (r/adapt-react-class (.-Tooltip js/MaterialUI)))
