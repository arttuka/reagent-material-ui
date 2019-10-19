(ns reagent-material-ui.core.snackbar-content
  "Imports @material-ui/core/SnackbarContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/snackbar-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def snackbar-content (adapt-react-class (.-SnackbarContent js/MaterialUI) "mui-snackbar-content"))
