(ns reagent-material-ui.icons.mode-comment-two-tone
  "Imports @material-ui/icons/ModeCommentTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def mode-comment-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14l4 4V4c0-1.1-.9-2-2-2zm0 15.17L18.83 16H4V4h16v13.17z"}) (e "path" #js {"d" "M4 4v12h14.83L20 17.17V4z", "opacity" ".3"}))
                                            "ModeCommentTwoTone"))
