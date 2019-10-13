(ns reagent-material-ui.icons.branding-watermark-sharp
  "Imports @material-ui/icons/BrandingWatermarkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def branding-watermark-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16h-9v-6h9v6z"})
                                               "BrandingWatermarkSharp"))
