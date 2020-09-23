(ns reagent-material-ui.icons.photo-album-outlined
  "Imports @material-ui/icons/PhotoAlbumOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-album-outlined (create-svg-icon (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-7 2v5l-1-.75L9 9V4h2zm7 16H6V4h1v9l3-2.25L13 13V4h5v16zm-6.72-2.04L9.5 15.81 7 19h10l-3.22-4.26z"})
                                           "PhotoAlbumOutlined"))
