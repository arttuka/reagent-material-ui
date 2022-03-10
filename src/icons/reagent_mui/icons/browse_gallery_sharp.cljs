(ns reagent-mui.icons.browse-gallery-sharp
  "Imports @mui/icons-material/BrowseGallerySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browse-gallery-sharp (create-svg-icon [(e "path" #js {"d" "M9 3c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9zm2.79 13.21L8 12.41V7h2v4.59l3.21 3.21-1.42 1.41z"}) (e "path" #js {"d" "M17.99 3.52v2.16C20.36 6.8 22 9.21 22 12c0 2.79-1.64 5.2-4.01 6.32v2.16C21.48 19.24 24 15.91 24 12s-2.52-7.24-6.01-8.48z"})]
                                           "BrowseGallerySharp"))
