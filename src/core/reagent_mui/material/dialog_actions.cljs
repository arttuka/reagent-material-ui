(ns reagent-mui.material.dialog-actions
  "Imports @mui/material/DialogActions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog-actions/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/DialogActions" :as MuiDialogActions]))

(def dialog-actions (adapt-react-class (.-default MuiDialogActions) "mui-dialog-actions"))
