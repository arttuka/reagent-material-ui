(ns reagent-mui.icons.voice-chat-sharp
  "Imports @mui/icons-material/VoiceChatSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def voice-chat-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2.01L2 22l4-4h16V2zm-4 12-4-3.2V14H6V6h8v3.2L18 6v8z"})
                                       "VoiceChatSharp"))
