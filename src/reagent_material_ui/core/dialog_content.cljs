(ns reagent-material-ui.core.dialog-content
  "Imports @material-ui/core/DialogContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def dialog-content (adapt-react-class (.-DialogContent js/MaterialUI) "mui-dialog-content"))
