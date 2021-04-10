(ns reagent-material-ui.core.expansion-panel-actions
  "Imports @material-ui/core/ExpansionPanelActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ExpansionPanelActions" :as MuiExpansionPanelActions]))

(def expansion-panel-actions (adapt-react-class (.-default MuiExpansionPanelActions) "mui-expansion-panel-actions"))
