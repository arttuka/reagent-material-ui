(ns reagent-material-ui.core.expansion-panel
  "Imports @material-ui/core/ExpansionPanel as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def expansion-panel (r/adapt-react-class (.-ExpansionPanel js/MaterialUI)))
