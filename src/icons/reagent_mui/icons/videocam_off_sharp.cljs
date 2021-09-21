(ns reagent-mui.icons.videocam-off-sharp
  "Imports @mui/icons-material/VideocamOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def videocam-off-sharp (create-svg-icon (e "path" #js {"d" "M21 16.61V6.5l-4 4V6h-6.61zM3.41 1.86 2 3.27 4.73 6H3v12h13.73l3 3 1.41-1.41z"})
                                         "VideocamOffSharp"))
