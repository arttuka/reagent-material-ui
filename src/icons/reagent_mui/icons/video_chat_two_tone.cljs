(ns reagent-mui.icons.video-chat-two-tone
  "Imports @mui/icons-material/VideoChatTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-chat-two-tone (create-svg-icon [(e "path" #js {"d" "M4 17.17 5.17 16H20V4H4v13.17zM7 7c0-.55.45-1 1-1h6c.55 0 1 .45 1 1v1.99L17 7v6l-2-1.99V13c0 .55-.45 1-1 1H8c-.55 0-1-.45-1-1V7z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H5.17L4 17.17V4h16v12z"}) (e "path" #js {"d" "M8 14h6c.55 0 1-.45 1-1v-1.99L17 13V7l-2 1.99V7c0-.55-.45-1-1-1H8c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1z"})]
                                          "VideoChatTwoTone"))
