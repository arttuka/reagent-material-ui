(ns reagent-mui.icons.trending-up-two-tone
  "Imports @mui/icons-material/TrendingUpTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def trending-up-two-tone (create-svg-icon (e "path" #js {"d" "m16 6 2.29 2.29-4.88 4.88-4-4L2 16.59 3.41 18l6-6 4 4 6.3-6.29L22 12V6h-6z"})
                                           "TrendingUpTwoTone"))
