(ns reagent-mui.icons.featured-video-sharp
  "Imports @mui/icons-material/FeaturedVideoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def featured-video-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-11 9H3V5h9v7z"})
                                           "FeaturedVideoSharp"))
