(ns reagent-material-ui.core.image-list-item-bar
  "Imports @material-ui/core/ImageListItemBar as a Reagent component.
   Original documentation is at https://material-ui.com/api/image-list-item-bar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ImageListItemBar" :as MuiImageListItemBar]))

(def image-list-item-bar (adapt-react-class (or (.-default MuiImageListItemBar) (.-ImageListItemBar MuiImageListItemBar)) "mui-image-list-item-bar"))
