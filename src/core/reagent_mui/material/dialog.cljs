(ns reagent-mui.material.dialog
  "Imports @mui/material/Dialog as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/dialog/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Dialog" :as MuiDialog]))

(def dialog (r/adapt-react-class (.-default MuiDialog)))
