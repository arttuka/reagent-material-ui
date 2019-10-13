(ns reagent-material-ui.core.collapse
  "Imports @material-ui/core/Collapse as a Reagent component.
   Original documentation is at https://material-ui.com/api/collapse/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def collapse (r/adapt-react-class (.-Collapse js/MaterialUI)))
