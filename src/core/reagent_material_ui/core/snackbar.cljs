(ns reagent-material-ui.core.snackbar
  "Imports @material-ui/core/Snackbar as a Reagent component.
   Original documentation is at https://material-ui.com/api/snackbar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Snackbar" :as Snackbar]))

(def snackbar (adapt-react-class (or (.-default Snackbar) (.-Snackbar Snackbar)) "mui-snackbar"))
