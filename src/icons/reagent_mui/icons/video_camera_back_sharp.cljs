(ns reagent-mui.icons.video-camera-back-sharp
  "Imports @mui/icons-material/VideoCameraBackSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-camera-back-sharp (create-svg-icon (e "path" #js {"d" "M18 10.48V4H2v16h16v-6.48l4 3.98v-11l-4 3.98zM5 16l2.38-3.17L9 15l2.62-3.5L15 16H5z"})
                                              "VideoCameraBackSharp"))
