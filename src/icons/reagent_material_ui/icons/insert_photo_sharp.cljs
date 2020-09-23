(ns reagent-material-ui.icons.insert-photo-sharp
  "Imports @material-ui/icons/InsertPhotoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-photo-sharp (create-svg-icon (e "path" #js {"d" "M21 21V3H3v18h18zM8.5 13.5l2.5 3.01L14.5 12l4.5 6H5l3.5-4.5z"})
                                         "InsertPhotoSharp"))
