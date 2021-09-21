(ns reagent-mui.icons.chat-bubble-sharp
  "Imports @mui/icons-material/ChatBubbleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chat-bubble-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2z"})
                                        "ChatBubbleSharp"))
