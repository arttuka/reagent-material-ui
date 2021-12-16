(ns reagent-mui.icons.mark-unread-chat-alt-sharp
  "Imports @mui/icons-material/MarkUnreadChatAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-unread-chat-alt-sharp (create-svg-icon [(e "circle" #js {"cx" "19", "cy" "3", "r" "3"}) (e "path" #js {"d" "M6 8V6h9.03c-1.21-1.6-1.08-3.21-.92-4H2.01L2 22l4-4h16V6.97C21.16 7.61 20.13 8 19 8H6zm8 6H6v-2h8v2zm4-3H6V9h12v2z"})]
                                                 "MarkUnreadChatAltSharp"))
