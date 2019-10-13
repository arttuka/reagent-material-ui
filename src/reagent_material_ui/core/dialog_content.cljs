(ns reagent-material-ui.core.dialog-content
  "Imports @material-ui/core/DialogContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-content/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def dialog-content (r/adapt-react-class (.-DialogContent js/MaterialUI)))
