(ns reagent-mui.icons.image-aspect-ratio-outlined
  "Imports @mui/icons-material/ImageAspectRatioOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def image-aspect-ratio-outlined (create-svg-icon (e "path" #js {"d" "M16 10h-2v2h2v-2zm0 4h-2v2h2v-2zm-8-4H6v2h2v-2zm4 0h-2v2h2v-2zm8-6H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V6h16v12z"})
                                                  "ImageAspectRatioOutlined"))
