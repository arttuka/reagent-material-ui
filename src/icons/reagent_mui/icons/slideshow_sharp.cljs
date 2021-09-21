(ns reagent-mui.icons.slideshow-sharp
  "Imports @mui/icons-material/SlideshowSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def slideshow-sharp (create-svg-icon (e "path" #js {"d" "M10 8v8l5-4-5-4zm11-5H3v18h18V3zm-2 16H5V5h14v14z"})
                                      "SlideshowSharp"))
