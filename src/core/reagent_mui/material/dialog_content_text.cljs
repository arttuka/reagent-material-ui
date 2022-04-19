(ns reagent-mui.material.dialog-content-text
  "Imports @mui/material/DialogContentText as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog-content-text/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/DialogContentText" :as MuiDialogContentText]))

(def dialog-content-text (adapt-react-class (.-default MuiDialogContentText) "mui-dialog-content-text"))
