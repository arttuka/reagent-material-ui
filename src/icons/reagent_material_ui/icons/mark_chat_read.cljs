(ns reagent-material-ui.icons.mark-chat-read
  "Imports @material-ui/icons/MarkChatRead as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mark-chat-read (create-svg-icon (e "path" #js {"d" "m17.34 20-3.54-3.54 1.41-1.41 2.12 2.12 4.24-4.24L23 14.34 17.34 20zM12 17c0-3.87 3.13-7 7-7 1.08 0 2.09.25 3 .68V4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v18l4-4h6c0-.17.01-.33.03-.5-.02-.16-.03-.33-.03-.5z"})
                                     "MarkChatRead"))
