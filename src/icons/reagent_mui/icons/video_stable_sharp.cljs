(ns reagent-mui.icons.video-stable-sharp
  "Imports @mui/icons-material/VideoStableSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-stable-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm2 14V6h2.95l-2.33 8.73L16.82 18H4zm16 0h-2.95l2.34-8.73L7.18 6H20v12z"})
                                         "VideoStableSharp"))
