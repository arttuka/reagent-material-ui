(ns reagent-mui.lab.masonry-item
  "Imports @mui/lab/MasonryItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/masonry-item/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/MasonryItem" :as MuiMasonryItem]))

(def masonry-item (r/adapt-react-class (.-default MuiMasonryItem)))
