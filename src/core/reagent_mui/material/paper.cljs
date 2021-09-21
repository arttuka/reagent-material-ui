(ns reagent-mui.material.paper
  "Imports @mui/material/Paper as a Reagent component.
   Original documentation is at https://mui.com/api/paper/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Paper" :as MuiPaper]))

(def paper (adapt-react-class (.-default MuiPaper) "mui-paper"))
