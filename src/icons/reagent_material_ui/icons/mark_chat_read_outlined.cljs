(ns reagent-material-ui.icons.mark-chat-read-outlined
  "Imports @material-ui/icons/MarkChatReadOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mark-chat-read-outlined (create-svg-icon (e "path" #js {"d" "M12 18H6l-4 4V4c0-1.1.9-2 2-2h16c1.1 0 2 .9 2 2v7h-2V4H4v12h8v2zm11-3.66l-1.41-1.41-4.24 4.24-2.12-2.12-1.41 1.41L17.34 20 23 14.34z"})
                                              "MarkChatReadOutlined"))
