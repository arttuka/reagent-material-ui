(ns reagent-mui.icons.video-chat-sharp
  "Imports @mui/icons-material/VideoChatSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-chat-sharp (create-svg-icon (e "path" #js {"d" "M2 2v20l4-4h16V2H2zm15 11-2-1.99V14H7V6h8v2.99L17 7v6z"})
                                       "VideoChatSharp"))
