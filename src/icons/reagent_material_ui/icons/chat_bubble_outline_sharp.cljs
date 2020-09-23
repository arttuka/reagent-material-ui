(ns reagent-material-ui.icons.chat-bubble-outline-sharp
  "Imports @material-ui/icons/ChatBubbleOutlineSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chat-bubble-outline-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-2 14H6l-2 2V4h16v12z"})
                                                "ChatBubbleOutlineSharp"))
