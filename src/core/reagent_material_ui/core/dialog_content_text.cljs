(ns reagent-material-ui.core.dialog-content-text
  "Imports @material-ui/core/DialogContentText as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog-content-text/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/DialogContentText" :as DialogContentText]))

(def dialog-content-text (adapt-react-class (or (.-default DialogContentText) (.-DialogContentText DialogContentText)) "mui-dialog-content-text"))
