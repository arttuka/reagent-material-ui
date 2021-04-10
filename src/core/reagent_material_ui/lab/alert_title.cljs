(ns reagent-material-ui.lab.alert-title
  "Imports @material-ui/lab/AlertTitle as a Reagent component.
   Original documentation is at https://material-ui.com/api/alert-title/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/AlertTitle" :as MuiAlertTitle]))

(def alert-title (adapt-react-class (.-default MuiAlertTitle) "mui-alert-title"))
