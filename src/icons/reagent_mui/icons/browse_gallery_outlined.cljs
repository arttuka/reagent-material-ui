(ns reagent-mui.icons.browse-gallery-outlined
  "Imports @mui/icons-material/BrowseGalleryOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browse-gallery-outlined (create-svg-icon [(e "path" #js {"d" "M9 3c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9zm0 16c-3.86 0-7-3.14-7-7s3.14-7 7-7 7 3.14 7 7-3.14 7-7 7z"}) (e "path" #js {"d" "M10 7H8v5.41l3.79 3.8 1.42-1.42-3.21-3.2zm7.99-3.48v2.16C20.36 6.8 22 9.21 22 12c0 2.79-1.64 5.2-4.01 6.32v2.16C21.48 19.24 24 15.91 24 12s-2.52-7.24-6.01-8.48z"})]
                                              "BrowseGalleryOutlined"))
