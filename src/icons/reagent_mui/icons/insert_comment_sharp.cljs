(ns reagent-mui.icons.insert-comment-sharp
  "Imports @mui/icons-material/InsertCommentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4V2zm-4 12H6v-2h12v2zm0-3H6V9h12v2zm0-3H6V6h12v2z"})
                                           "InsertCommentSharp"))
