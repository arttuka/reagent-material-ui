(ns reagent-mui.icons.mark-chat-unread-sharp
  "Imports @mui/icons-material/MarkChatUnreadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-chat-unread-sharp (create-svg-icon (e "path" #js {"d" "M22 6.98V18H6l-4 4V2h12.1c-.06.32-.1.66-.1 1 0 2.76 2.24 5 5 5 1.13 0 2.16-.39 3-1.02zM16 3c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3z"})
                                             "MarkChatUnreadSharp"))
