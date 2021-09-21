(ns reagent-mui.icons.mode-comment-rounded
  "Imports @mui/icons-material/ModeCommentRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mode-comment-rounded (create-svg-icon (e "path" #js {"d" "M22 4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14l4 4V4z"})
                                           "ModeCommentRounded"))
