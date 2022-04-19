(ns reagent-mui.material.card-media
  "Imports @mui/material/CardMedia as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-media/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CardMedia" :as MuiCardMedia]))

(def card-media (adapt-react-class (.-default MuiCardMedia) "mui-card-media"))
