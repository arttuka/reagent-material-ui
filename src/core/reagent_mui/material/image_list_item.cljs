(ns reagent-mui.material.image-list-item
  "Imports @mui/material/ImageListItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/image-list-item/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ImageListItem" :as MuiImageListItem]))

(def image-list-item (r/adapt-react-class (.-default MuiImageListItem)))
