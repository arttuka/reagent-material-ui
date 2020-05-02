(ns reagent-material-ui.core.snackbar
  "Imports @material-ui/core/Snackbar as a Reagent component.
   Original documentation is at https://material-ui.com/api/snackbar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Snackbar" :as MuiSnackbar]))

(def snackbar (adapt-react-class (or (.-default MuiSnackbar) (.-Snackbar MuiSnackbar)) "mui-snackbar"))
