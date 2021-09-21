(ns reagent-mui.icons.view-carousel-sharp
  "Imports @mui/icons-material/ViewCarouselSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-carousel-sharp (create-svg-icon (e "path" #js {"d" "M2 7h4v10H2V7zm5 12h10V5H7v14zM18 7h4v10h-4V7z"})
                                          "ViewCarouselSharp"))
