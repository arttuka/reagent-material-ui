(ns reagent-material-ui.core.expansion-panel-summary
  "Imports @material-ui/core/ExpansionPanelSummary as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-summary/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def expansion-panel-summary (r/adapt-react-class (.-ExpansionPanelSummary js/MaterialUI)))
