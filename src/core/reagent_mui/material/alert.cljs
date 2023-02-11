(ns reagent-mui.material.alert
  "Imports @mui/material/Alert as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/alert/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Alert" :as MuiAlert]))

(def alert (r/adapt-react-class (.-default MuiAlert)))
