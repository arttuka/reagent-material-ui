(ns reagent-mui.icons.video-call-sharp
  "Imports @mui/icons-material/VideoCallSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-call-sharp (create-svg-icon (e "path" #js {"d" "M17 10.5V6H3v12h14v-4.5l4 4v-11l-4 4zM14 13h-3v3H9v-3H6v-2h3V8h2v3h3v2z"})
                                       "VideoCallSharp"))
