(ns reagent-mui.icons.chat-bubble-outline-sharp
  "Imports @mui/icons-material/ChatBubbleOutlineSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chat-bubble-outline-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-2 14H6l-2 2V4h16v12z"})
                                                "ChatBubbleOutlineSharp"))
