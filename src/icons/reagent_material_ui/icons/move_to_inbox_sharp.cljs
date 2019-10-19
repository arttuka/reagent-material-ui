(ns reagent-material-ui.icons.move-to-inbox-sharp
  "Imports @material-ui/icons/MoveToInboxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def move-to-inbox-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 12h-4c0 1.66-1.35 3-3 3s-3-1.34-3-3H4.99V5H19v10zm-3-5h-2V7h-4v3H8l4 4 4-4z"})
                                          "MoveToInboxSharp"))
