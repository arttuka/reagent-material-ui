(ns reagent-mui.material.dialog
  "Imports @mui/material/Dialog as a Reagent component.
   Original documentation is at https://mui.com/api/dialog/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Dialog" :as MuiDialog]))

(def dialog (adapt-react-class (.-default MuiDialog) "mui-dialog"))
