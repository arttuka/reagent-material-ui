(ns reagent-material-ui.icons.mark-chat-unread-two-tone
  "Imports @material-ui/icons/MarkChatUnreadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mark-chat-unread-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 16h16V7.9c-.32.06-.66.1-1 .1-2.42 0-4.44-1.72-4.9-4H4v12z", "opacity" ".3"}) (e "path" #js {"d" "M20 7.9c.74-.15 1.42-.48 2-.92V16c0 1.1-.9 2-2 2H6l-4 4V4c0-1.1.9-2 2-2h10.1c-.06.32-.1.66-.1 1s.04.68.1 1H4v12h16V7.9zM16 3c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3z"}))
                                                "MarkChatUnreadTwoTone"))
