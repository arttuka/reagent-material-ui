(ns reagent-mui.icons.chat-bubble-two-tone
  "Imports @mui/icons-material/ChatBubbleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chat-bubble-two-tone (create-svg-icon [(e "path" #js {"d" "m4 18 2-2h14V4H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H6l-2 2V4h16v12z"})]
                                           "ChatBubbleTwoTone"))
