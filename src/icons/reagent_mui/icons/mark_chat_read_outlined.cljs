(ns reagent-mui.icons.mark-chat-read-outlined
  "Imports @mui/icons-material/MarkChatReadOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-chat-read-outlined (create-svg-icon (e "path" #js {"d" "M12 18H6l-4 4V4c0-1.1.9-2 2-2h16c1.1 0 2 .9 2 2v7h-2V4H4v12h8v2zm11-3.66-1.41-1.41-4.24 4.24-2.12-2.12-1.41 1.41L17.34 20 23 14.34z"})
                                              "MarkChatReadOutlined"))
