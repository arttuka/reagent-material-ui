(ns reagent-mui.icons.mark-chat-read-sharp
  "Imports @mui/icons-material/MarkChatReadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-chat-read-sharp (create-svg-icon (e "path" #js {"d" "M12.03 17.5c-.02.17-.03.33-.03.5H6l-4 4V2h20v8.68c-.91-.43-1.92-.68-3-.68-3.87 0-7 3.13-7 7 0 .17.01.33.03.5zM23 14.34l-1.41-1.41-4.24 4.24-2.12-2.12-1.41 1.41L17.34 20 23 14.34z"})
                                           "MarkChatReadSharp"))
