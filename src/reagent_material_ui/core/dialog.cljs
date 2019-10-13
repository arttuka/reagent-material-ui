(ns reagent-material-ui.core.dialog
  "Imports @material-ui/core/Dialog as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def dialog (r/adapt-react-class (.-Dialog js/MaterialUI)))
