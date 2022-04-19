(ns reagent-mui.material.card
  "Imports @mui/material/Card as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Card" :as MuiCard]))

(def card (adapt-react-class (.-default MuiCard) "mui-card"))
