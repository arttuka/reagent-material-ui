(ns reagent-mui.icons.mark-chat-unread-outlined
  "Imports @mui/icons-material/MarkChatUnreadOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-chat-unread-outlined (create-svg-icon (e "path" #js {"d" "M22 6.98V16c0 1.1-.9 2-2 2H6l-4 4V4c0-1.1.9-2 2-2h10.1c-.06.32-.1.66-.1 1s.04.68.1 1H4v12h16V7.9c.74-.15 1.42-.48 2-.92zM16 3c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3z"})
                                                "MarkChatUnreadOutlined"))
