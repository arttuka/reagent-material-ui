(ns reagent-mui.material.image-list-item-bar
  "Imports @mui/material/ImageListItemBar as a Reagent component.
   Original documentation is at https://mui.com/api/image-list-item-bar/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ImageListItemBar" :as MuiImageListItemBar]))

(def image-list-item-bar (adapt-react-class (.-default MuiImageListItemBar) "mui-image-list-item-bar"))
