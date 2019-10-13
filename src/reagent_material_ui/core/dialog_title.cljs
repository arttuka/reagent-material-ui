(ns reagent-material-ui.core.dialog-title
  "Imports @material-ui/core/DialogTitle as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-title/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def dialog-title (r/adapt-react-class (.-DialogTitle js/MaterialUI)))
