(ns reagent-mui.icons.photo-album-rounded
  "Imports @mui/icons-material/PhotoAlbumRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-album-rounded (create-svg-icon (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM6 4h5v8l-2.5-1.5L6 12V4zm.63 14.19 1.99-2.56c.2-.25.58-.26.78-.01l1.74 2.1 2.6-3.34c.2-.26.6-.26.79.01l2.87 3.82c.25.33.01.8-.4.8H7.02c-.41-.01-.65-.49-.39-.82z"})
                                          "PhotoAlbumRounded"))
