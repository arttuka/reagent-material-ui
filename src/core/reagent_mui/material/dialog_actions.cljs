(ns reagent-mui.material.dialog-actions
  "Imports @mui/material/DialogActions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog-actions/ ."
  (:require [reagent.core :as r]
            ["@mui/material/DialogActions" :as MuiDialogActions]))

(def dialog-actions (r/adapt-react-class (.-default MuiDialogActions)))
