(ns reagent-mui.icons.mark-email-unread
  "Imports @mui/icons-material/MarkEmailUnread as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-email-unread (create-svg-icon (e "path" #js {"d" "M22 8.98V18c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h10.1c-.06.32-.1.66-.1 1 0 1.48.65 2.79 1.67 3.71L12 11 4 6v2l8 5 5.3-3.32c.54.2 1.1.32 1.7.32 1.13 0 2.16-.39 3-1.02zM16 5c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3z"})
                                        "MarkEmailUnread"))
