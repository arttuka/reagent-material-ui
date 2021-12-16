(ns reagent-mui.icons.mark-unread-chat-alt-rounded
  "Imports @mui/icons-material/MarkUnreadChatAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-unread-chat-alt-rounded (create-svg-icon [(e "circle" #js {"cx" "19", "cy" "3", "r" "3"}) (e "path" #js {"d" "M7 8c-.55 0-1-.45-1-1s.45-1 1-1h8.03c-1.21-1.6-1.08-3.21-.92-4H4.01c-1.1 0-2 .89-2 2L2 19.58c0 .89 1.08 1.34 1.71.71L6 18h14c1.1 0 2-.9 2-2V6.97C21.16 7.61 20.13 8 19 8H7zm6 6H7c-.55 0-1-.45-1-1s.45-1 1-1h6c.55 0 1 .45 1 1s-.45 1-1 1zm4-3H7c-.55 0-1-.45-1-1s.45-1 1-1h10c.55 0 1 .45 1 1s-.45 1-1 1z"})]
                                                   "MarkUnreadChatAltRounded"))
