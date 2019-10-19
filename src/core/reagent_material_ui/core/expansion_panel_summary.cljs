(ns reagent-material-ui.core.expansion-panel-summary
  "Imports @material-ui/core/ExpansionPanelSummary as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-summary/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def expansion-panel-summary (adapt-react-class (.-ExpansionPanelSummary js/MaterialUI) "mui-expansion-panel-summary"))
