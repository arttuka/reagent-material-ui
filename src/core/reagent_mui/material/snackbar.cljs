(ns reagent-mui.material.snackbar
  "Imports @mui/material/Snackbar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/snackbar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Snackbar" :as MuiSnackbar]))

(def snackbar (r/adapt-react-class (.-default MuiSnackbar)))
