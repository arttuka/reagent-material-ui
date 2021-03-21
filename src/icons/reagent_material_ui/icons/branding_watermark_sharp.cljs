(ns reagent-material-ui.icons.branding-watermark-sharp
  "Imports @material-ui/icons/BrandingWatermarkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def branding-watermark-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16h-9v-6h9v6z"})
                                               "BrandingWatermarkSharp"))
