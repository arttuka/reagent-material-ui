(ns reagent-mui.icons.branding-watermark-sharp
  "Imports @mui/icons-material/BrandingWatermarkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def branding-watermark-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16h-9v-6h9v6z"})
                                               "BrandingWatermarkSharp"))
