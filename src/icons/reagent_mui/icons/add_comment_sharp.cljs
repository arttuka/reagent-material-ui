(ns reagent-mui.icons.add-comment-sharp
  "Imports @mui/icons-material/AddCommentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4V2zm-5 9h-4v4h-2v-4H7V9h4V5h2v4h4v2z"})
                                        "AddCommentSharp"))
