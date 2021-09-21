(ns reagent-mui.material.snackbar-content
  "Imports @mui/material/SnackbarContent as a Reagent component.
   Original documentation is at https://mui.com/api/snackbar-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SnackbarContent" :as MuiSnackbarContent]))

(def snackbar-content (adapt-react-class (.-default MuiSnackbarContent) "mui-snackbar-content"))
