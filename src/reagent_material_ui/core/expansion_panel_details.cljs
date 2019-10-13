(ns reagent-material-ui.core.expansion-panel-details
  "Imports @material-ui/core/ExpansionPanelDetails as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-details/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def expansion-panel-details (r/adapt-react-class (.-ExpansionPanelDetails js/MaterialUI)))
