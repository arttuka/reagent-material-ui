(ns reagent-mui.material.paper
  "Imports @mui/material/Paper as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/paper/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Paper" :as MuiPaper]))

(def paper (r/adapt-react-class (.-default MuiPaper)))
