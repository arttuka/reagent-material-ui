(ns reagent-mui.material.snackbar
  "Imports @mui/material/Snackbar as a Reagent component.
   Original documentation is at https://mui.com/api/snackbar/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Snackbar" :as MuiSnackbar]))

(def snackbar (adapt-react-class (.-default MuiSnackbar) "mui-snackbar"))
