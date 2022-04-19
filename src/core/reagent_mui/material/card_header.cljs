(ns reagent-mui.material.card-header
  "Imports @mui/material/CardHeader as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-header/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CardHeader" :as MuiCardHeader]))

(def card-header (adapt-react-class (.-default MuiCardHeader) "mui-card-header"))
