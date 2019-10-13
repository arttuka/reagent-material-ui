(ns reagent-material-ui.core.snackbar-content
  "Imports @material-ui/core/SnackbarContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/snackbar-content/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def snackbar-content (r/adapt-react-class (.-SnackbarContent js/MaterialUI)))
