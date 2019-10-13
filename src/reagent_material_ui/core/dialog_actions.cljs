(ns reagent-material-ui.core.dialog-actions
  "Imports @material-ui/core/DialogActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-actions/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def dialog-actions (r/adapt-react-class (.-DialogActions js/MaterialUI)))
