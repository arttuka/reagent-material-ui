(ns reagent-mui.material.card
  "Imports @mui/material/Card as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Card" :as MuiCard]))

(def card (r/adapt-react-class (.-default MuiCard)))
