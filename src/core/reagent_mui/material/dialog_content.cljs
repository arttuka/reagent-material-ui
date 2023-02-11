(ns reagent-mui.material.dialog-content
  "Imports @mui/material/DialogContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog-content/ ."
  (:require [reagent.core :as r]
            ["@mui/material/DialogContent" :as MuiDialogContent]))

(def dialog-content (r/adapt-react-class (.-default MuiDialogContent)))
