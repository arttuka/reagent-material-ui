(ns reagent-mui.icons.forum-two-tone
  "Imports @mui/icons-material/ForumTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def forum-two-tone (create-svg-icon [(e "path" #js {"d" "M15 11V4H4v8.17L5.17 11H6z", "opacity" ".3"}) (e "path" #js {"d" "M16 13c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v14l4-4h10zm-12-.83V4h11v7H5.17L4 12.17zM22 7c0-.55-.45-1-1-1h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7z"})]
                                     "ForumTwoTone"))
