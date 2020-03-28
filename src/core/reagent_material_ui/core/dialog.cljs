(ns reagent-material-ui.core.dialog
  "Imports @material-ui/core/Dialog as a Reagent component.
   Original documentation is at https://material-ui.com/api/dialog/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Dialog" :as Dialog]))

(def dialog (adapt-react-class (or (.-default Dialog) (.-Dialog Dialog)) "mui-dialog"))
