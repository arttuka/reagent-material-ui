(ns reagent-material-ui.core.expansion-panel-actions
  "Imports @material-ui/core/ExpansionPanelActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-actions/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def expansion-panel-actions (r/adapt-react-class (.-ExpansionPanelActions js/MaterialUI)))
