(ns reagent-mui.lab.masonry
  "Imports @mui/lab/Masonry as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/masonry/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/Masonry" :as MuiMasonry]))

(def masonry (r/adapt-react-class (.-default MuiMasonry)))
