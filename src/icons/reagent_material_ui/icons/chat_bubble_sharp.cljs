(ns reagent-material-ui.icons.chat-bubble-sharp
  "Imports @material-ui/icons/ChatBubbleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chat-bubble-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2z"})
                                        "ChatBubbleSharp"))
