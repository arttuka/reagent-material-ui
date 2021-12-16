(ns reagent-mui.icons.mark-unread-chat-alt-outlined
  "Imports @mui/icons-material/MarkUnreadChatAltOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-unread-chat-alt-outlined (create-svg-icon [(e "path" #js {"d" "M20 16H4V4h10.1c-.08-.39-.18-1.11 0-2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V6.98c-.58.44-1.26.77-2 .92V16z"}) (e "circle" #js {"cx" "19", "cy" "3", "r" "3"}) (e "path" #js {"d" "M6 12h8v2H6zm0-3h12v2H6zm0-1h12v-.1c-1.21-.25-2.25-.95-2.97-1.9H6v2z"})]
                                                    "MarkUnreadChatAltOutlined"))
