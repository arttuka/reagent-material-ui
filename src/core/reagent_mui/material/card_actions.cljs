(ns reagent-mui.material.card-actions
  "Imports @mui/material/CardActions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-actions/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CardActions" :as MuiCardActions]))

(def card-actions (r/adapt-react-class (.-default MuiCardActions)))
