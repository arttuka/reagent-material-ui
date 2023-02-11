(ns reagent-mui.material.snackbar-content
  "Imports @mui/material/SnackbarContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/snackbar-content/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SnackbarContent" :as MuiSnackbarContent]))

(def snackbar-content (r/adapt-react-class (.-default MuiSnackbarContent)))
