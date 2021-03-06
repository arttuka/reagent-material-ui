(ns reagent-material-ui.icons.branding-watermark-rounded
  "Imports @material-ui/icons/BrandingWatermarkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def branding-watermark-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-1 12c0 .55-.45 1-1 1h-7c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1h7c.55 0 1 .45 1 1v4z"})
                                                 "BrandingWatermarkRounded"))
