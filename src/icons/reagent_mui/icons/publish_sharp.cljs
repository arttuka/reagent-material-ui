(ns reagent-mui.icons.publish-sharp
  "Imports @mui/icons-material/PublishSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def publish-sharp (create-svg-icon (e "path" #js {"d" "M5 4v2h14V4H5zm0 10h4v6h6v-6h4l-7-7-7 7z"})
                                    "PublishSharp"))
