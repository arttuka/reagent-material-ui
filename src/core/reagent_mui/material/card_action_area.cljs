(ns reagent-mui.material.card-action-area
  "Imports @mui/material/CardActionArea as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-action-area/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CardActionArea" :as MuiCardActionArea]))

(def card-action-area (adapt-react-class (.-default MuiCardActionArea) "mui-card-action-area"))
