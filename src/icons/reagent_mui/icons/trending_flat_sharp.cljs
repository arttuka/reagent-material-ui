(ns reagent-mui.icons.trending-flat-sharp
  "Imports @mui/icons-material/TrendingFlatSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def trending-flat-sharp (create-svg-icon (e "path" #js {"d" "m22 12-4-4v3H3v2h15v3l4-4z"})
                                          "TrendingFlatSharp"))
