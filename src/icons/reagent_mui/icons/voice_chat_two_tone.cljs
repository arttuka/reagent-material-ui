(ns reagent-mui.icons.voice-chat-two-tone
  "Imports @mui/icons-material/VoiceChatTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def voice-chat-two-tone (create-svg-icon [(e "path" #js {"d" "M4 17.17 5.17 16H20V4H4v13.17zM7 7h7v2.4L17 7v6l-3-2.4V13H7V7z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H5.17L4 17.17V4h16v12zm-6-5.4 3 2.4V7l-3 2.4V7H7v6h7z"})]
                                          "VoiceChatTwoTone"))
