(ns reagent-material-ui.icons.mode-comment-sharp
  "Imports @material-ui/icons/ModeCommentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mode-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4z"})
                                         "ModeCommentSharp"))
