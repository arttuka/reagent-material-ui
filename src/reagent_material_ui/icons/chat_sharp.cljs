(ns reagent-material-ui.icons.chat-sharp
  "Imports @material-ui/icons/ChatSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def chat-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2.01L2 22l4-4h16V2zM6 9h12v2H6V9zm8 5H6v-2h8v2zm4-6H6V6h12v2z"})
                                 "ChatSharp"))
