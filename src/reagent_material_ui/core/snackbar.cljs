(ns reagent-material-ui.core.snackbar
  "Imports @material-ui/core/Snackbar as a Reagent component.
   Original documentation is at https://material-ui.com/api/snackbar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def snackbar (r/adapt-react-class (.-Snackbar js/MaterialUI)))
