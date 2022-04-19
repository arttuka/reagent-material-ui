(ns reagent-mui.material.alert-title
  "Imports @mui/material/AlertTitle as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/alert-title/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AlertTitle" :as MuiAlertTitle]))

(def alert-title (adapt-react-class (.-default MuiAlertTitle) "mui-alert-title"))
