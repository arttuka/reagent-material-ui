(ns reagent-mui.icons.featured-play-list-sharp
  "Imports @mui/icons-material/FeaturedPlayListSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def featured-play-list-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-11 8H3V9h9v2zm0-4H3V5h9v2z"})
                                               "FeaturedPlayListSharp"))
