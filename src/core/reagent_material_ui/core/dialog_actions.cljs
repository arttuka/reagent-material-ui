(ns reagent-material-ui.core.dialog-actions
  "Imports @material-ui/core/DialogActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/DialogActions" :as MuiDialogActions]))

(def dialog-actions (adapt-react-class (.-default MuiDialogActions) "mui-dialog-actions"))
