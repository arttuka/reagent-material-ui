(ns reagent-mui.material.card-action-area
  "Imports @mui/material/CardActionArea as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-action-area/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CardActionArea" :as MuiCardActionArea]))

(def card-action-area (r/adapt-react-class (.-default MuiCardActionArea)))
