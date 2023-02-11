(ns reagent-mui.material.linear-progress
  "Imports @mui/material/LinearProgress as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/linear-progress/ ."
  (:require [reagent.core :as r]
            ["@mui/material/LinearProgress" :as MuiLinearProgress]))

(def linear-progress (r/adapt-react-class (.-default MuiLinearProgress)))
