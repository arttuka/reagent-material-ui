(ns reagent-mui.icons.video-label-sharp
  "Imports @mui/icons-material/VideoLabelSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-label-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 13H3V5h18v11z"})
                                        "VideoLabelSharp"))
