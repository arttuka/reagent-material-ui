(ns reagent-mui.icons.photo-album-two-tone
  "Imports @mui/icons-material/PhotoAlbumTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-album-two-tone (create-svg-icon [(e "path" #js {"d" "M16 4v7l-2.5-1.5L11 11V4H6v16h12V4h-2zM7 18l2.38-3.17L11 17l2.62-3.5L17 18H7z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H6V4h5v7l2.5-1.5L16 11V4h2v16zm-4.38-6.5L17 18H7l2.38-3.17L11 17l2.62-3.5z"})]
                                           "PhotoAlbumTwoTone"))
