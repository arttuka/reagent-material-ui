(ns reagent-mui.icons.density-small-outlined
  "Imports @mui/icons-material/DensitySmallOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def density-small-outlined (create-svg-icon (e "path" #js {"d" "M3 2h18v2H3zm0 18h18v2H3zm0-6h18v2H3zm0-6h18v2H3z"})
                                             "DensitySmallOutlined"))
