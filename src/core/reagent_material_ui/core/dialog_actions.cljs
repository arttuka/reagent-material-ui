(ns reagent-material-ui.core.dialog-actions
  "Imports @material-ui/core/DialogActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/DialogActions" :as DialogActions]))

(def dialog-actions (adapt-react-class (or (.-default DialogActions) (.-DialogActions DialogActions)) "mui-dialog-actions"))
