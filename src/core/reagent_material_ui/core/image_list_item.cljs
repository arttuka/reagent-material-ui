(ns reagent-material-ui.core.image-list-item
  "Imports @material-ui/core/ImageListItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/image-list-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ImageListItem" :as MuiImageListItem]))

(def image-list-item (adapt-react-class (or (.-default MuiImageListItem) (.-ImageListItem MuiImageListItem)) "mui-image-list-item"))
