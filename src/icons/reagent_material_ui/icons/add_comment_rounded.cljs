(ns reagent-material-ui.icons.add-comment-rounded
  "Imports @material-ui/icons/AddCommentRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-comment-rounded (create-svg-icon (e "path" #js {"d" "M3.71 20.29L6 18h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v15.59c0 .89 1.08 1.33 1.71.7zM11 11H9c-.55 0-1-.45-1-1s.45-1 1-1h2V7c0-.55.45-1 1-1s1 .45 1 1v2h2c.55 0 1 .45 1 1s-.45 1-1 1h-2v2c0 .55-.45 1-1 1s-1-.45-1-1v-2z"})
                                          "AddCommentRounded"))
