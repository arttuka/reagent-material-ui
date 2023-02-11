(ns reagent-mui.material.filled-input
  "Imports @mui/material/FilledInput as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/filled-input/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FilledInput" :as MuiFilledInput]))

(def filled-input (r/adapt-react-class (.-default MuiFilledInput)))
