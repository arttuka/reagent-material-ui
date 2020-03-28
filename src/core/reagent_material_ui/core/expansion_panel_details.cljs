(ns reagent-material-ui.core.expansion-panel-details
  "Imports @material-ui/core/ExpansionPanelDetails as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel-details/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ExpansionPanelDetails" :as ExpansionPanelDetails]))

(def expansion-panel-details (adapt-react-class (or (.-default ExpansionPanelDetails) (.-ExpansionPanelDetails ExpansionPanelDetails)) "mui-expansion-panel-details"))
