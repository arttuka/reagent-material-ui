(ns reagent-mui.icons.video-file-sharp
  "Imports @mui/icons-material/VideoFileSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-file-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm-1 7V3.5L18.5 9H13zm1 5 2-1.06v4.12L14 16v2H8v-6h6v2z"})
                                       "VideoFileSharp"))
