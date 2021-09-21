(ns reagent-mui.material.card-actions
  "Imports @mui/material/CardActions as a Reagent component.
   Original documentation is at https://mui.com/api/card-actions/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CardActions" :as MuiCardActions]))

(def card-actions (adapt-react-class (.-default MuiCardActions) "mui-card-actions"))
