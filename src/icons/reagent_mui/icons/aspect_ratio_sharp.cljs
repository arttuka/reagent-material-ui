(ns reagent-mui.icons.aspect-ratio-sharp
  "Imports @mui/icons-material/AspectRatioSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def aspect-ratio-sharp (create-svg-icon (e "path" #js {"d" "M19 12h-2v3h-3v2h5v-5zM7 9h3V7H5v5h2V9zm16-6H1v18h22V3zm-2 16.01H3V4.99h18v14.02z"})
                                         "AspectRatioSharp"))
