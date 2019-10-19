(ns reagent-material-ui.icons.voice-chat-sharp
  "Imports @material-ui/icons/VoiceChatSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def voice-chat-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2.01L2 22l4-4h16V2zm-4 12l-4-3.2V14H6V6h8v3.2L18 6v8z"})
                                       "VoiceChatSharp"))
