(ns reagent-material-ui.core.collapse
  "Imports @material-ui/core/Collapse as a Reagent component.
   Original documentation is at https://material-ui.com/api/collapse/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def collapse (adapt-react-class (.-Collapse js/MaterialUI) "mui-collapse"))
