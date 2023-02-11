(ns reagent-mui.material.alert-title
  "Imports @mui/material/AlertTitle as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/alert-title/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AlertTitle" :as MuiAlertTitle]))

(def alert-title (r/adapt-react-class (.-default MuiAlertTitle)))
