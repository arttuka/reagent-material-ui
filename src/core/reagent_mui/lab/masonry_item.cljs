(ns reagent-mui.lab.masonry-item
  "Imports @mui/lab/MasonryItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/masonry-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/MasonryItem" :as MuiMasonryItem]))

(def masonry-item (adapt-react-class (.-default MuiMasonryItem) "mui-masonry-item"))
