(ns reagent-material-ui.core.collapse
  "Imports @material-ui/core/Collapse as a Reagent component.
   Original documentation is at https://material-ui.com/api/collapse/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Collapse" :as MuiCollapse]))

(def collapse (adapt-react-class (or (.-default MuiCollapse) (.-Collapse MuiCollapse)) "mui-collapse"))
