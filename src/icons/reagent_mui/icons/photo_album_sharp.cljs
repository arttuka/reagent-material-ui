(ns reagent-mui.icons.photo-album-sharp
  "Imports @mui/icons-material/PhotoAlbumSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-album-sharp (create-svg-icon (e "path" #js {"d" "M20 2H4v20h16V2zM6 4h5v8l-2.5-1.5L6 12V4zm0 15 3-3.86 2.14 2.58 3-3.86L18 19H6z"})
                                        "PhotoAlbumSharp"))
