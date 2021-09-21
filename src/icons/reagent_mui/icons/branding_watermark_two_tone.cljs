(ns reagent-mui.icons.branding-watermark-two-tone
  "Imports @mui/icons-material/BrandingWatermarkTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def branding-watermark-two-tone (create-svg-icon [(e "path" #js {"d" "M3 19h18V5H3v14zm8-7h9v6h-9v-6z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H3V5h18v14zm-10-7h9v6h-9z"})]
                                                  "BrandingWatermarkTwoTone"))
