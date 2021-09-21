(ns reagent-mui.material.dialog-content
  "Imports @mui/material/DialogContent as a Reagent component.
   Original documentation is at https://mui.com/api/dialog-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/DialogContent" :as MuiDialogContent]))

(def dialog-content (adapt-react-class (.-default MuiDialogContent) "mui-dialog-content"))
