(ns reagent-mui.icons.add-comment-two-tone
  "Imports @mui/icons-material/AddCommentTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-comment-two-tone (create-svg-icon [(e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14l4 4V4c0-1.1-.9-2-2-2zm0 15.17L18.83 16H4V4h16v13.17zM13 5h-2v4H7v2h4v4h2v-4h4V9h-4z"}) (e "path" #js {"d" "M4 4v12h14.83L20 17.17V4H4zm13 7h-4v4h-2v-4H7V9h4V5h2v4h4v2z", "opacity" ".3"})]
                                           "AddCommentTwoTone"))
