(ns reagent-mui.material.dialog-title
  "Imports @mui/material/DialogTitle as a Reagent component.
   Original documentation is at https://mui.com/api/dialog-title/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/DialogTitle" :as MuiDialogTitle]))

(def dialog-title (adapt-react-class (.-default MuiDialogTitle) "mui-dialog-title"))
