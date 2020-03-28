(ns reagent-material-ui.core.dialog-content
  "Imports @material-ui/core/DialogContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/DialogContent" :as DialogContent]))

(def dialog-content (adapt-react-class (or (.-default DialogContent) (.-DialogContent DialogContent)) "mui-dialog-content"))
