(ns reagent-material-ui.core.image-list
  "Imports @material-ui/core/ImageList as a Reagent component.
   Original documentation is at https://material-ui.com/api/image-list/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ImageList" :as MuiImageList]))

(def image-list (adapt-react-class (or (.-default MuiImageList) (.-ImageList MuiImageList)) "mui-image-list"))
