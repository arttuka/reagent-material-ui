(ns reagent-material-ui.core.dialog-title
  "Imports @material-ui/core/DialogTitle as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-title/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def dialog-title (adapt-react-class (.-DialogTitle js/MaterialUI) "mui-dialog-title"))
