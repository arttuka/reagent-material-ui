(ns reagent-mui.material.paper
  "Imports @mui/material/Paper as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/paper/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Paper" :as MuiPaper]))

(def paper (adapt-react-class (.-default MuiPaper) "mui-paper"))
