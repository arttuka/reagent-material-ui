(ns reagent-mui.material.image-list
  "Imports @mui/material/ImageList as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/image-list/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ImageList" :as MuiImageList]))

(def image-list (r/adapt-react-class (.-default MuiImageList)))
