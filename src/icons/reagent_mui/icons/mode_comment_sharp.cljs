(ns reagent-mui.icons.mode-comment-sharp
  "Imports @mui/icons-material/ModeCommentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mode-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4z"})
                                         "ModeCommentSharp"))
