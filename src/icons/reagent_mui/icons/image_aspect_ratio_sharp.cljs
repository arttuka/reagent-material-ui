(ns reagent-mui.icons.image-aspect-ratio-sharp
  "Imports @mui/icons-material/ImageAspectRatioSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def image-aspect-ratio-sharp (create-svg-icon (e "path" #js {"d" "M16 10h-2v2h2v-2zm0 4h-2v2h2v-2zm-8-4H6v2h2v-2zm4 0h-2v2h2v-2zm10-6H2v16h20V4zm-2 14H4V6h16v12z"})
                                               "ImageAspectRatioSharp"))
