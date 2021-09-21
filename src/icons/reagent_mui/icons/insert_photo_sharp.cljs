(ns reagent-mui.icons.insert-photo-sharp
  "Imports @mui/icons-material/InsertPhotoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-photo-sharp (create-svg-icon (e "path" #js {"d" "M21 21V3H3v18h18zM8.5 13.5l2.5 3.01L14.5 12l4.5 6H5l3.5-4.5z"})
                                         "InsertPhotoSharp"))
