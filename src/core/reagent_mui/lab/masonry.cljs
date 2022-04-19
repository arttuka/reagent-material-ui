(ns reagent-mui.lab.masonry
  "Imports @mui/lab/Masonry as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/masonry/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/Masonry" :as MuiMasonry]))

(def masonry (adapt-react-class (.-default MuiMasonry) "mui-masonry"))
