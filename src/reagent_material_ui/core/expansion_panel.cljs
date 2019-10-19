(ns reagent-material-ui.core.expansion-panel
  "Imports @material-ui/core/ExpansionPanel as a Reagent component.
   Original documentation is at https://material-ui.com/api/expansion-panel/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def expansion-panel (adapt-react-class (.-ExpansionPanel js/MaterialUI) "mui-expansion-panel"))
