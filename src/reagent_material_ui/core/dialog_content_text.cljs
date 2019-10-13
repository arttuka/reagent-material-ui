(ns reagent-material-ui.core.dialog-content-text
  "Imports @material-ui/core/DialogContentText as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-content-text/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def dialog-content-text (r/adapt-react-class (.-DialogContentText js/MaterialUI)))
