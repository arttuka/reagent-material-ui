(ns reagent-mui.material.circular-progress
  "Imports @mui/material/CircularProgress as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/circular-progress/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CircularProgress" :as MuiCircularProgress]))

(def circular-progress (r/adapt-react-class (.-default MuiCircularProgress)))
