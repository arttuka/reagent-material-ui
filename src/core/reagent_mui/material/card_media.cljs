(ns reagent-mui.material.card-media
  "Imports @mui/material/CardMedia as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-media/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CardMedia" :as MuiCardMedia]))

(def card-media (r/adapt-react-class (.-default MuiCardMedia)))
