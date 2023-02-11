(ns reagent-mui.material.dialog-title
  "Imports @mui/material/DialogTitle as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog-title/ ."
  (:require [reagent.core :as r]
            ["@mui/material/DialogTitle" :as MuiDialogTitle]))

(def dialog-title (r/adapt-react-class (.-default MuiDialogTitle)))
