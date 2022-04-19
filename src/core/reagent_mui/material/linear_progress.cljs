(ns reagent-mui.material.linear-progress
  "Imports @mui/material/LinearProgress as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/linear-progress/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/LinearProgress" :as MuiLinearProgress]))

(def linear-progress (adapt-react-class (.-default MuiLinearProgress) "mui-linear-progress"))
