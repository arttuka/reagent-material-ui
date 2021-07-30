(ns reagent-material-ui.icons.photo-album-two-tone
  "Imports @material-ui/icons/PhotoAlbumTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def photo-album-two-tone (create-svg-icon [(e "path" #js {"d" "m13 13-3-2.25L7 13V4H6v16h12V4h-5v9zm4 6H7l2.5-3.19 1.78 2.15 2.5-3.22L17 19z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM9 4h2v5l-1-.75L9 9V4zm9 16H6V4h1v9l3-2.25L13 13V4h5v16zm-8.5-4.19L7 19h10l-3.22-4.26-2.5 3.22z"})]
                                           "PhotoAlbumTwoTone"))
