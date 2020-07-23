(ns reagent-material-ui.icons.mode-comment-rounded
  "Imports @material-ui/icons/ModeCommentRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mode-comment-rounded (create-svg-icon (e "path" #js {"d" "M22 4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14l4 4V4z"})
                                           "ModeCommentRounded"))
