(ns reagent-mui.material.card-header
  "Imports @mui/material/CardHeader as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-header/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CardHeader" :as MuiCardHeader]))

(def card-header (r/adapt-react-class (.-default MuiCardHeader)))
