(ns reagent-mui.material.image-list
  "Imports @mui/material/ImageList as a Reagent component.
   Original documentation is at https://mui.com/api/image-list/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ImageList" :as MuiImageList]))

(def image-list (adapt-react-class (.-default MuiImageList) "mui-image-list"))
