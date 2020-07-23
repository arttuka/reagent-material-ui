(ns reagent-material-ui.icons.mode-comment-sharp
  "Imports @material-ui/icons/ModeCommentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mode-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4z"})
                                         "ModeCommentSharp"))
