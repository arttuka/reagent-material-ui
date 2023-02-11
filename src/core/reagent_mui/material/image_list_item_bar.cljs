(ns reagent-mui.material.image-list-item-bar
  "Imports @mui/material/ImageListItemBar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/image-list-item-bar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ImageListItemBar" :as MuiImageListItemBar]))

(def image-list-item-bar (r/adapt-react-class (.-default MuiImageListItemBar)))
