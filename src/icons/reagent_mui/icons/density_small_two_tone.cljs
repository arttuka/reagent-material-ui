(ns reagent-mui.icons.density-small-two-tone
  "Imports @mui/icons-material/DensitySmallTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def density-small-two-tone (create-svg-icon (e "path" #js {"d" "M3 2h18v2H3zm0 18h18v2H3zm0-6h18v2H3zm0-6h18v2H3z"})
                                             "DensitySmallTwoTone"))
